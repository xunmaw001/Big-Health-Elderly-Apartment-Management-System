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


import com.dao.ShoufeirenyuanDao;
import com.entity.ShoufeirenyuanEntity;
import com.service.ShoufeirenyuanService;
import com.entity.vo.ShoufeirenyuanVO;
import com.entity.view.ShoufeirenyuanView;

@Service("shoufeirenyuanService")
public class ShoufeirenyuanServiceImpl extends ServiceImpl<ShoufeirenyuanDao, ShoufeirenyuanEntity> implements ShoufeirenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoufeirenyuanEntity> page = this.selectPage(
                new Query<ShoufeirenyuanEntity>(params).getPage(),
                new EntityWrapper<ShoufeirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoufeirenyuanEntity> wrapper) {
		  Page<ShoufeirenyuanView> page =new Query<ShoufeirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShoufeirenyuanVO> selectListVO(Wrapper<ShoufeirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoufeirenyuanVO selectVO(Wrapper<ShoufeirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoufeirenyuanView> selectListView(Wrapper<ShoufeirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoufeirenyuanView selectView(Wrapper<ShoufeirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
