package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JihuaqiandingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JihuaqiandingView;


/**
 * 计划签订
 *
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
public interface JihuaqiandingService extends IService<JihuaqiandingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JihuaqiandingView> selectListView(Wrapper<JihuaqiandingEntity> wrapper);
   	
   	JihuaqiandingView selectView(@Param("ew") Wrapper<JihuaqiandingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JihuaqiandingEntity> wrapper);
   	

}

