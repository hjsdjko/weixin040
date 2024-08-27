package com.cl.dao;

import com.cl.entity.JihuaqiandingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JihuaqiandingView;


/**
 * 计划签订
 * 
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
public interface JihuaqiandingDao extends BaseMapper<JihuaqiandingEntity> {
	
	List<JihuaqiandingView> selectListView(@Param("ew") Wrapper<JihuaqiandingEntity> wrapper);

	List<JihuaqiandingView> selectListView(Pagination page,@Param("ew") Wrapper<JihuaqiandingEntity> wrapper);
	
	JihuaqiandingView selectView(@Param("ew") Wrapper<JihuaqiandingEntity> wrapper);
	

}
