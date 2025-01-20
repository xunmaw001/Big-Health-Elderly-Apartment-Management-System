package com.dao;

import com.entity.ShengritixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengritixingVO;
import com.entity.view.ShengritixingView;


/**
 * 生日提醒
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface ShengritixingDao extends BaseMapper<ShengritixingEntity> {
	
	List<ShengritixingVO> selectListVO(@Param("ew") Wrapper<ShengritixingEntity> wrapper);
	
	ShengritixingVO selectVO(@Param("ew") Wrapper<ShengritixingEntity> wrapper);
	
	List<ShengritixingView> selectListView(@Param("ew") Wrapper<ShengritixingEntity> wrapper);

	List<ShengritixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShengritixingEntity> wrapper);
	
	ShengritixingView selectView(@Param("ew") Wrapper<ShengritixingEntity> wrapper);
	

}
