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

import com.cl.entity.JihuaqiandingEntity;
import com.cl.entity.view.JihuaqiandingView;

import com.cl.service.JihuaqiandingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 计划签订
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
@RestController
@RequestMapping("/jihuaqianding")
public class JihuaqiandingController {
    @Autowired
    private JihuaqiandingService jihuaqiandingService;





    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JihuaqiandingEntity jihuaqianding, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jihuaqianding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JihuaqiandingEntity> ew = new EntityWrapper<JihuaqiandingEntity>();


		PageUtils page = jihuaqiandingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jihuaqianding), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JihuaqiandingEntity jihuaqianding, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jihuaqianding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JihuaqiandingEntity> ew = new EntityWrapper<JihuaqiandingEntity>();

		PageUtils page = jihuaqiandingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jihuaqianding), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JihuaqiandingEntity jihuaqianding){
       	EntityWrapper<JihuaqiandingEntity> ew = new EntityWrapper<JihuaqiandingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jihuaqianding, "jihuaqianding")); 
        return R.ok().put("data", jihuaqiandingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JihuaqiandingEntity jihuaqianding){
        EntityWrapper< JihuaqiandingEntity> ew = new EntityWrapper< JihuaqiandingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jihuaqianding, "jihuaqianding")); 
		JihuaqiandingView jihuaqiandingView =  jihuaqiandingService.selectView(ew);
		return R.ok("查询计划签订成功").put("data", jihuaqiandingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JihuaqiandingEntity jihuaqianding = jihuaqiandingService.selectById(id);
		jihuaqianding = jihuaqiandingService.selectView(new EntityWrapper<JihuaqiandingEntity>().eq("id", id));
        return R.ok().put("data", jihuaqianding);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JihuaqiandingEntity jihuaqianding = jihuaqiandingService.selectById(id);
		jihuaqianding = jihuaqiandingService.selectView(new EntityWrapper<JihuaqiandingEntity>().eq("id", id));
        return R.ok().put("data", jihuaqianding);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JihuaqiandingEntity jihuaqianding, HttpServletRequest request){
    	jihuaqianding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jihuaqianding);

        jihuaqiandingService.insert(jihuaqianding);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JihuaqiandingEntity jihuaqianding, HttpServletRequest request){
    	jihuaqianding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jihuaqianding);
    	jihuaqianding.setUserid((Long)request.getSession().getAttribute("userId"));

        jihuaqiandingService.insert(jihuaqianding);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JihuaqiandingEntity jihuaqianding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jihuaqianding);
        jihuaqiandingService.updateById(jihuaqianding);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jihuaqiandingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	







}
