package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LvyoujihuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyoujihuaView;


/**
 * 旅游计划
 *
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
public interface LvyoujihuaService extends IService<LvyoujihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyoujihuaView> selectListView(Wrapper<LvyoujihuaEntity> wrapper);
   	
   	LvyoujihuaView selectView(@Param("ew") Wrapper<LvyoujihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyoujihuaEntity> wrapper);
   	

}

