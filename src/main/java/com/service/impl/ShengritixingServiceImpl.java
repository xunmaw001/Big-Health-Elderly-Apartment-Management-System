package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShengritixingDao;
import com.entity.ShengritixingEntity;
import com.service.ShengritixingService;
import com.entity.vo.ShengritixingVO;
import com.entity.view.ShengritixingView;

@Service("shengritixingService")
public class ShengritixingServiceImpl extends ServiceImpl<ShengritixingDao, ShengritixingEntity> implements ShengritixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengritixingEntity> page = this.selectPage(
                new Query<ShengritixingEntity>(params).getPage(),
                new EntityWrapper<ShengritixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengritixingEntity> wrapper) {
		  Page<ShengritixingView> page =new Query<ShengritixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengritixingVO> selectListVO(Wrapper<ShengritixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengritixingVO selectVO(Wrapper<ShengritixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengritixingView> selectListView(Wrapper<ShengritixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengritixingView selectView(Wrapper<ShengritixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
