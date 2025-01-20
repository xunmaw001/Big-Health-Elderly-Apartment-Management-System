package com.dao;

import com.entity.LaorenyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaorenyuyueVO;
import com.entity.view.LaorenyuyueView;


/**
 * 老人预约
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface LaorenyuyueDao extends BaseMapper<LaorenyuyueEntity> {
	
	List<LaorenyuyueVO> selectListVO(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
	
	LaorenyuyueVO selectVO(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
	
	List<LaorenyuyueView> selectListView(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);

	List<LaorenyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
	
	LaorenyuyueView selectView(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
	

}
