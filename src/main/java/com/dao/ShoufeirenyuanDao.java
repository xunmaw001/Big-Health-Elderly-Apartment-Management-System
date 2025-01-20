package com.dao;

import com.entity.ShoufeirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoufeirenyuanVO;
import com.entity.view.ShoufeirenyuanView;


/**
 * 收费人员
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface ShoufeirenyuanDao extends BaseMapper<ShoufeirenyuanEntity> {
	
	List<ShoufeirenyuanVO> selectListVO(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
	
	ShoufeirenyuanVO selectVO(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
	
	List<ShoufeirenyuanView> selectListView(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);

	List<ShoufeirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
	
	ShoufeirenyuanView selectView(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
	

}
