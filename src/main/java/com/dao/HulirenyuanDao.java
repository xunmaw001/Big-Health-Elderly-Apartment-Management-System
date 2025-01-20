package com.dao;

import com.entity.HulirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HulirenyuanVO;
import com.entity.view.HulirenyuanView;


/**
 * 护理人员
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface HulirenyuanDao extends BaseMapper<HulirenyuanEntity> {
	
	List<HulirenyuanVO> selectListVO(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
	
	HulirenyuanVO selectVO(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
	
	List<HulirenyuanView> selectListView(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);

	List<HulirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
	
	HulirenyuanView selectView(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
	

}
