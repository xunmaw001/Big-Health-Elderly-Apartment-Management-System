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


import com.dao.JiedaidengjiDao;
import com.entity.JiedaidengjiEntity;
import com.service.JiedaidengjiService;
import com.entity.vo.JiedaidengjiVO;
import com.entity.view.JiedaidengjiView;

@Service("jiedaidengjiService")
public class JiedaidengjiServiceImpl extends ServiceImpl<JiedaidengjiDao, JiedaidengjiEntity> implements JiedaidengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiedaidengjiEntity> page = this.selectPage(
                new Query<JiedaidengjiEntity>(params).getPage(),
                new EntityWrapper<JiedaidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiedaidengjiEntity> wrapper) {
		  Page<JiedaidengjiView> page =new Query<JiedaidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiedaidengjiVO> selectListVO(Wrapper<JiedaidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiedaidengjiVO selectVO(Wrapper<JiedaidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiedaidengjiView> selectListView(Wrapper<JiedaidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiedaidengjiView selectView(Wrapper<JiedaidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
