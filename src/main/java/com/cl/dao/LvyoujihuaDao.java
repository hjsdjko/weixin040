package com.cl.dao;

import com.cl.entity.LvyoujihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyoujihuaView;


/**
 * 旅游计划
 * 
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
public interface LvyoujihuaDao extends BaseMapper<LvyoujihuaEntity> {
	
	List<LvyoujihuaView> selectListView(@Param("ew") Wrapper<LvyoujihuaEntity> wrapper);

	List<LvyoujihuaView> selectListView(Pagination page,@Param("ew") Wrapper<LvyoujihuaEntity> wrapper);
	
	LvyoujihuaView selectView(@Param("ew") Wrapper<LvyoujihuaEntity> wrapper);
	

}
