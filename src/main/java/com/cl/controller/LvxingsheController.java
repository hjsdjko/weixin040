package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.LvxingsheEntity;
import com.cl.entity.view.LvxingsheView;

import com.cl.service.LvxingsheService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 旅行社
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
@RestController
@RequestMapping("/lvxingshe")
public class LvxingsheController {
    @Autowired
    private LvxingsheService lvxingsheService;





    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		LvxingsheEntity u = lvxingsheService.selectOne(new EntityWrapper<LvxingsheEntity>().eq("lvxingshezhanghao", username));
        if(u==null || !u.getLvxingshemima().equals(password)) {
            return R.error("账号或密码不正确");
        }

		String token = tokenService.generateToken(u.getId(), username,"lvxingshe",  "旅行社" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody LvxingsheEntity lvxingshe){
    	//ValidatorUtils.validateEntity(lvxingshe);
    	LvxingsheEntity u = lvxingsheService.selectOne(new EntityWrapper<LvxingsheEntity>().eq("lvxingshezhanghao", lvxingshe.getLvxingshezhanghao()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		lvxingshe.setId(uId);
        lvxingsheService.insert(lvxingshe);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        LvxingsheEntity u = lvxingsheService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	LvxingsheEntity u = lvxingsheService.selectOne(new EntityWrapper<LvxingsheEntity>().eq("lvxingshezhanghao", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setLvxingshemima("123456");
        lvxingsheService.updateById(u);
        return R.ok("密码已重置为：123456");
    }


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvxingsheEntity lvxingshe, 
		HttpServletRequest request){

        EntityWrapper<LvxingsheEntity> ew = new EntityWrapper<LvxingsheEntity>();


		PageUtils page = lvxingsheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvxingshe), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvxingsheEntity lvxingshe, 
		HttpServletRequest request){
        EntityWrapper<LvxingsheEntity> ew = new EntityWrapper<LvxingsheEntity>();

		PageUtils page = lvxingsheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvxingshe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvxingsheEntity lvxingshe){
       	EntityWrapper<LvxingsheEntity> ew = new EntityWrapper<LvxingsheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvxingshe, "lvxingshe")); 
        return R.ok().put("data", lvxingsheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvxingsheEntity lvxingshe){
        EntityWrapper< LvxingsheEntity> ew = new EntityWrapper< LvxingsheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvxingshe, "lvxingshe")); 
		LvxingsheView lvxingsheView =  lvxingsheService.selectView(ew);
		return R.ok("查询旅行社成功").put("data", lvxingsheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvxingsheEntity lvxingshe = lvxingsheService.selectById(id);
		lvxingshe = lvxingsheService.selectView(new EntityWrapper<LvxingsheEntity>().eq("id", id));
        return R.ok().put("data", lvxingshe);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvxingsheEntity lvxingshe = lvxingsheService.selectById(id);
		lvxingshe = lvxingsheService.selectView(new EntityWrapper<LvxingsheEntity>().eq("id", id));
        return R.ok().put("data", lvxingshe);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvxingsheEntity lvxingshe, HttpServletRequest request){
    	lvxingshe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvxingshe);
    	LvxingsheEntity u = lvxingsheService.selectOne(new EntityWrapper<LvxingsheEntity>().eq("lvxingshezhanghao", lvxingshe.getLvxingshezhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		lvxingshe.setId(new Date().getTime());
        lvxingsheService.insert(lvxingshe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvxingsheEntity lvxingshe, HttpServletRequest request){
    	lvxingshe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvxingshe);
    	LvxingsheEntity u = lvxingsheService.selectOne(new EntityWrapper<LvxingsheEntity>().eq("lvxingshezhanghao", lvxingshe.getLvxingshezhanghao()));
		if(u!=null) {
			return R.error("用户已存在");
		}

		lvxingshe.setId(new Date().getTime());
        lvxingsheService.insert(lvxingshe);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LvxingsheEntity lvxingshe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvxingshe);
        lvxingsheService.updateById(lvxingshe);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvxingsheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







}
