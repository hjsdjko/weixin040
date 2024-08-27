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

import com.cl.entity.LvyoujihuaEntity;
import com.cl.entity.view.LvyoujihuaView;

import com.cl.service.LvyoujihuaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 旅游计划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
@RestController
@RequestMapping("/lvyoujihua")
public class LvyoujihuaController {
    @Autowired
    private LvyoujihuaService lvyoujihuaService;





    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvyoujihuaEntity lvyoujihua, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date lvyoushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date lvyoushijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lvxingshe")) {
			lvyoujihua.setLvxingshezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			lvyoujihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LvyoujihuaEntity> ew = new EntityWrapper<LvyoujihuaEntity>();

                if(lvyoushijianstart!=null) ew.ge("lvyoushijian", lvyoushijianstart);
                if(lvyoushijianend!=null) ew.le("lvyoushijian", lvyoushijianend);

		PageUtils page = lvyoujihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyoujihua), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvyoujihuaEntity lvyoujihua, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date lvyoushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date lvyoushijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("lvxingshe")) {
			lvyoujihua.setLvxingshezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			lvyoujihua.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LvyoujihuaEntity> ew = new EntityWrapper<LvyoujihuaEntity>();
                if(lvyoushijianstart!=null) ew.ge("lvyoushijian", lvyoushijianstart);
                if(lvyoushijianend!=null) ew.le("lvyoushijian", lvyoushijianend);

		PageUtils page = lvyoujihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyoujihua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvyoujihuaEntity lvyoujihua){
       	EntityWrapper<LvyoujihuaEntity> ew = new EntityWrapper<LvyoujihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvyoujihua, "lvyoujihua")); 
        return R.ok().put("data", lvyoujihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvyoujihuaEntity lvyoujihua){
        EntityWrapper< LvyoujihuaEntity> ew = new EntityWrapper< LvyoujihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvyoujihua, "lvyoujihua")); 
		LvyoujihuaView lvyoujihuaView =  lvyoujihuaService.selectView(ew);
		return R.ok("查询旅游计划成功").put("data", lvyoujihuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvyoujihuaEntity lvyoujihua = lvyoujihuaService.selectById(id);
		lvyoujihua = lvyoujihuaService.selectView(new EntityWrapper<LvyoujihuaEntity>().eq("id", id));
        return R.ok().put("data", lvyoujihua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvyoujihuaEntity lvyoujihua = lvyoujihuaService.selectById(id);
		lvyoujihua = lvyoujihuaService.selectView(new EntityWrapper<LvyoujihuaEntity>().eq("id", id));
        return R.ok().put("data", lvyoujihua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvyoujihuaEntity lvyoujihua, HttpServletRequest request){
    	lvyoujihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyoujihua);

        lvyoujihuaService.insert(lvyoujihua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvyoujihuaEntity lvyoujihua, HttpServletRequest request){
    	lvyoujihua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyoujihua);
    	lvyoujihua.setUserid((Long)request.getSession().getAttribute("userId"));

        lvyoujihuaService.insert(lvyoujihua);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LvyoujihuaEntity lvyoujihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvyoujihua);
        lvyoujihuaService.updateById(lvyoujihua);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvyoujihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







}
