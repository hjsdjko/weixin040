package com.cl.dao;

import com.cl.entity.LvyouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyouxinxiView;


/**
 * 旅游信息
 * 
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
public interface LvyouxinxiDao extends BaseMapper<LvyouxinxiEntity> {
	
	List<LvyouxinxiView> selectListView(@Param("ew") Wrapper<LvyouxinxiEntity> wrapper);

	List<LvyouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LvyouxinxiEntity> wrapper);
	
	LvyouxinxiView selectView(@Param("ew") Wrapper<LvyouxinxiEntity> wrapper);
	

}
