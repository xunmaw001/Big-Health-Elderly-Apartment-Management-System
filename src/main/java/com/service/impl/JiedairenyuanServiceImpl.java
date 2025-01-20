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


import com.dao.JiedairenyuanDao;
import com.entity.JiedairenyuanEntity;
import com.service.JiedairenyuanService;
import com.entity.vo.JiedairenyuanVO;
import com.entity.view.JiedairenyuanView;

@Service("jiedairenyuanService")
public class JiedairenyuanServiceImpl extends ServiceImpl<JiedairenyuanDao, JiedairenyuanEntity> implements JiedairenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedairenyuanEntity> page = this.selectPage(
                new Query<JiedairenyuanEntity>(params).getPage(),
                new EntityWrapper<JiedairenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedairenyuanEntity> wrapper) {
		  Page<JiedairenyuanView> page =new Query<JiedairenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedairenyuanVO> selectListVO(Wrapper<JiedairenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedairenyuanVO selectVO(Wrapper<JiedairenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedairenyuanView> selectListView(Wrapper<JiedairenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedairenyuanView selectView(Wrapper<JiedairenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
