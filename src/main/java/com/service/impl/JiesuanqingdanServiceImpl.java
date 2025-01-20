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


import com.dao.JiesuanqingdanDao;
import com.entity.JiesuanqingdanEntity;
import com.service.JiesuanqingdanService;
import com.entity.vo.JiesuanqingdanVO;
import com.entity.view.JiesuanqingdanView;

@Service("jiesuanqingdanService")
public class JiesuanqingdanServiceImpl extends ServiceImpl<JiesuanqingdanDao, JiesuanqingdanEntity> implements JiesuanqingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiesuanqingdanEntity> page = this.selectPage(
                new Query<JiesuanqingdanEntity>(params).getPage(),
                new EntityWrapper<JiesuanqingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiesuanqingdanEntity> wrapper) {
		  Page<JiesuanqingdanView> page =new Query<JiesuanqingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiesuanqingdanVO> selectListVO(Wrapper<JiesuanqingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiesuanqingdanVO selectVO(Wrapper<JiesuanqingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiesuanqingdanView> selectListView(Wrapper<JiesuanqingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiesuanqingdanView selectView(Wrapper<JiesuanqingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
