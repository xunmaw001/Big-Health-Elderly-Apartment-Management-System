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


import com.dao.HulirenyuanDao;
import com.entity.HulirenyuanEntity;
import com.service.HulirenyuanService;
import com.entity.vo.HulirenyuanVO;
import com.entity.view.HulirenyuanView;

@Service("hulirenyuanService")
public class HulirenyuanServiceImpl extends ServiceImpl<HulirenyuanDao, HulirenyuanEntity> implements HulirenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HulirenyuanEntity> page = this.selectPage(
                new Query<HulirenyuanEntity>(params).getPage(),
                new EntityWrapper<HulirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HulirenyuanEntity> wrapper) {
		  Page<HulirenyuanView> page =new Query<HulirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HulirenyuanVO> selectListVO(Wrapper<HulirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HulirenyuanVO selectVO(Wrapper<HulirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HulirenyuanView> selectListView(Wrapper<HulirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HulirenyuanView selectView(Wrapper<HulirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
