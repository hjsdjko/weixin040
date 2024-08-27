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


import com.cl.dao.LvyoujihuaDao;
import com.cl.entity.LvyoujihuaEntity;
import com.cl.service.LvyoujihuaService;
import com.cl.entity.view.LvyoujihuaView;

@Service("lvyoujihuaService")
public class LvyoujihuaServiceImpl extends ServiceImpl<LvyoujihuaDao, LvyoujihuaEntity> implements LvyoujihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyoujihuaEntity> page = this.selectPage(
                new Query<LvyoujihuaEntity>(params).getPage(),
                new EntityWrapper<LvyoujihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyoujihuaEntity> wrapper) {
		  Page<LvyoujihuaView> page =new Query<LvyoujihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LvyoujihuaView> selectListView(Wrapper<LvyoujihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyoujihuaView selectView(Wrapper<LvyoujihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
