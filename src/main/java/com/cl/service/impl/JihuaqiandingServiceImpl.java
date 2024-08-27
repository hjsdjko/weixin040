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


import com.cl.dao.JihuaqiandingDao;
import com.cl.entity.JihuaqiandingEntity;
import com.cl.service.JihuaqiandingService;
import com.cl.entity.view.JihuaqiandingView;

@Service("jihuaqiandingService")
public class JihuaqiandingServiceImpl extends ServiceImpl<JihuaqiandingDao, JihuaqiandingEntity> implements JihuaqiandingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JihuaqiandingEntity> page = this.selectPage(
                new Query<JihuaqiandingEntity>(params).getPage(),
                new EntityWrapper<JihuaqiandingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JihuaqiandingEntity> wrapper) {
		  Page<JihuaqiandingView> page =new Query<JihuaqiandingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JihuaqiandingView> selectListView(Wrapper<JihuaqiandingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JihuaqiandingView selectView(Wrapper<JihuaqiandingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
