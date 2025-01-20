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


import com.dao.LaorenyuyueDao;
import com.entity.LaorenyuyueEntity;
import com.service.LaorenyuyueService;
import com.entity.vo.LaorenyuyueVO;
import com.entity.view.LaorenyuyueView;

@Service("laorenyuyueService")
public class LaorenyuyueServiceImpl extends ServiceImpl<LaorenyuyueDao, LaorenyuyueEntity> implements LaorenyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaorenyuyueEntity> page = this.selectPage(
                new Query<LaorenyuyueEntity>(params).getPage(),
                new EntityWrapper<LaorenyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaorenyuyueEntity> wrapper) {
		  Page<LaorenyuyueView> page =new Query<LaorenyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaorenyuyueVO> selectListVO(Wrapper<LaorenyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaorenyuyueVO selectVO(Wrapper<LaorenyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaorenyuyueView> selectListView(Wrapper<LaorenyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaorenyuyueView selectView(Wrapper<LaorenyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
