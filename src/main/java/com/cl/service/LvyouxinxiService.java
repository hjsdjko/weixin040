package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LvyouxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LvyouxinxiView;


/**
 * 旅游信息
 *
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
public interface LvyouxinxiService extends IService<LvyouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyouxinxiView> selectListView(Wrapper<LvyouxinxiEntity> wrapper);
   	
   	LvyouxinxiView selectView(@Param("ew") Wrapper<LvyouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyouxinxiEntity> wrapper);
   	

}

