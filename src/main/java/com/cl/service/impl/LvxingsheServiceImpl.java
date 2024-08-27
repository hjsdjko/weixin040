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


import com.cl.dao.LvxingsheDao;
import com.cl.entity.LvxingsheEntity;
import com.cl.service.LvxingsheService;
import com.cl.entity.view.LvxingsheView;

@Service("lvxingsheService")
public class LvxingsheServiceImpl extends ServiceImpl<LvxingsheDao, LvxingsheEntity> implements LvxingsheService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvxingsheEntity> page = this.selectPage(
                new Query<LvxingsheEntity>(params).getPage(),
                new EntityWrapper<LvxingsheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvxingsheEntity> wrapper) {
		  Page<LvxingsheView> page =new Query<LvxingsheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvxingsheView> selectListView(Wrapper<LvxingsheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvxingsheView selectView(Wrapper<LvxingsheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
