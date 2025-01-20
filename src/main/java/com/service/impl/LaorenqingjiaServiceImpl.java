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


import com.dao.LaorenqingjiaDao;
import com.entity.LaorenqingjiaEntity;
import com.service.LaorenqingjiaService;
import com.entity.vo.LaorenqingjiaVO;
import com.entity.view.LaorenqingjiaView;

@Service("laorenqingjiaService")
public class LaorenqingjiaServiceImpl extends ServiceImpl<LaorenqingjiaDao, LaorenqingjiaEntity> implements LaorenqingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaorenqingjiaEntity> page = this.selectPage(
                new Query<LaorenqingjiaEntity>(params).getPage(),
                new EntityWrapper<LaorenqingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaorenqingjiaEntity> wrapper) {
		  Page<LaorenqingjiaView> page =new Query<LaorenqingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaorenqingjiaVO> selectListVO(Wrapper<LaorenqingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaorenqingjiaVO selectVO(Wrapper<LaorenqingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaorenqingjiaView> selectListView(Wrapper<LaorenqingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaorenqingjiaView selectView(Wrapper<LaorenqingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
