package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.LvyouxinxiDao;
import com.cl.entity.LvyouxinxiEntity;
import com.cl.service.LvyouxinxiService;
import com.cl.entity.view.LvyouxinxiView;

@Service("lvyouxinxiService")
public class LvyouxinxiServiceImpl extends ServiceImpl<LvyouxinxiDao, LvyouxinxiEntity> implements LvyouxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyouxinxiEntity> page = this.selectPage(
                new Query<LvyouxinxiEntity>(params).getPage(),
                new EntityWrapper<LvyouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyouxinxiEntity> wrapper) {
		  Page<LvyouxinxiView> page =new Query<LvyouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvyouxinxiView> selectListView(Wrapper<LvyouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyouxinxiView selectView(Wrapper<LvyouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
