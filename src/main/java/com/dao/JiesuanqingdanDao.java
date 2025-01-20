package com.dao;

import com.entity.JiesuanqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiesuanqingdanVO;
import com.entity.view.JiesuanqingdanView;


/**
 * 结算清单
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface JiesuanqingdanDao extends BaseMapper<JiesuanqingdanEntity> {
	
	List<JiesuanqingdanVO> selectListVO(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
	
	JiesuanqingdanVO selectVO(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
	
	List<JiesuanqingdanView> selectListView(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);

	List<JiesuanqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
	
	JiesuanqingdanView selectView(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
	

}
