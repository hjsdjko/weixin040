package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LvxingsheEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvxingsheView;


/**
 * 旅行社
 *
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
public interface LvxingsheService extends IService<LvxingsheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvxingsheView> selectListView(Wrapper<LvxingsheEntity> wrapper);
   	
   	LvxingsheView selectView(@Param("ew") Wrapper<LvxingsheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvxingsheEntity> wrapper);
   	

}

