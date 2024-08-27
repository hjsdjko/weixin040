package com.cl.dao;

import com.cl.entity.LvxingsheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvxingsheView;


/**
 * 旅行社
 * 
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
public interface LvxingsheDao extends BaseMapper<LvxingsheEntity> {
	
	List<LvxingsheView> selectListView(@Param("ew") Wrapper<LvxingsheEntity> wrapper);

	List<LvxingsheView> selectListView(Pagination page,@Param("ew") Wrapper<LvxingsheEntity> wrapper);
	
	LvxingsheView selectView(@Param("ew") Wrapper<LvxingsheEntity> wrapper);
	

}
