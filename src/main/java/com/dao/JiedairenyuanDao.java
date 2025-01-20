package com.dao;

import com.entity.JiedairenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedairenyuanVO;
import com.entity.view.JiedairenyuanView;


/**
 * 接待人员
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface JiedairenyuanDao extends BaseMapper<JiedairenyuanEntity> {
	
	List<JiedairenyuanVO> selectListVO(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
	
	JiedairenyuanVO selectVO(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
	
	List<JiedairenyuanView> selectListView(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);

	List<JiedairenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
	
	JiedairenyuanView selectView(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
	

}
