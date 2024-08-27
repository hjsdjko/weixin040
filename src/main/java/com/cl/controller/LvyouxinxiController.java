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

import com.cl.entity.LvyouxinxiEntity;
import com.cl.entity.view.LvyouxinxiView;

import com.cl.service.LvyouxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;

/**
 * 旅游信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
@RestController
@RequestMapping("/lvyouxinxi")
public class LvyouxinxiController {
    @Autowired
    private LvyouxinxiService lvyouxinxiService;





    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LvyouxinxiEntity lvyouxinxi, 
		HttpServletRequest request){

        EntityWrapper<LvyouxinxiEntity> ew = new EntityWrapper<LvyouxinxiEntity>();


		PageUtils page = lvyouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyouxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LvyouxinxiEntity lvyouxinxi, 
		HttpServletRequest request){
        EntityWrapper<LvyouxinxiEntity> ew = new EntityWrapper<LvyouxinxiEntity>();

		PageUtils page = lvyouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyouxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LvyouxinxiEntity lvyouxinxi){
       	EntityWrapper<LvyouxinxiEntity> ew = new EntityWrapper<LvyouxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lvyouxinxi, "lvyouxinxi")); 
        return R.ok().put("data", lvyouxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LvyouxinxiEntity lvyouxinxi){
        EntityWrapper< LvyouxinxiEntity> ew = new EntityWrapper< LvyouxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lvyouxinxi, "lvyouxinxi")); 
		LvyouxinxiView lvyouxinxiView =  lvyouxinxiService.selectView(ew);
		return R.ok("查询旅游信息成功").put("data", lvyouxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LvyouxinxiEntity lvyouxinxi = lvyouxinxiService.selectById(id);
		lvyouxinxi.setClicktime(new Date());
		lvyouxinxiService.updateById(lvyouxinxi);
		lvyouxinxi = lvyouxinxiService.selectView(new EntityWrapper<LvyouxinxiEntity>().eq("id", id));
        return R.ok().put("data", lvyouxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LvyouxinxiEntity lvyouxinxi = lvyouxinxiService.selectById(id);
		lvyouxinxi.setClicktime(new Date());
		lvyouxinxiService.updateById(lvyouxinxi);
		lvyouxinxi = lvyouxinxiService.selectView(new EntityWrapper<LvyouxinxiEntity>().eq("id", id));
        return R.ok().put("data", lvyouxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LvyouxinxiEntity lvyouxinxi, HttpServletRequest request){
    	lvyouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyouxinxi);

        lvyouxinxiService.insert(lvyouxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LvyouxinxiEntity lvyouxinxi, HttpServletRequest request){
    	lvyouxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lvyouxinxi);

        lvyouxinxiService.insert(lvyouxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LvyouxinxiEntity lvyouxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lvyouxinxi);
        lvyouxinxiService.updateById(lvyouxinxi);//全部更新
        return R.ok();
    }

    /**  
     * 审核 
     */   
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<LvyouxinxiEntity> list = new ArrayList<LvyouxinxiEntity>();
        for(Long id : ids) {
            LvyouxinxiEntity lvyouxinxi = lvyouxinxiService.selectById(id);
            lvyouxinxi.setSfsh(sfsh);
            lvyouxinxi.setShhf(shhf);
            list.add(lvyouxinxi);
        }    
        lvyouxinxiService.updateBatchById(list);
        return R.ok();
    }    
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lvyouxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,LvyouxinxiEntity lvyouxinxi, HttpServletRequest request,String pre){
        EntityWrapper<LvyouxinxiEntity> ew = new EntityWrapper<LvyouxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = lvyouxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lvyouxinxi), params), params));
        return R.ok().put("data", page);
    }







}
