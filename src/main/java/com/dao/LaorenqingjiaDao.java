package com.dao;

import com.entity.LaorenqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaorenqingjiaVO;
import com.entity.view.LaorenqingjiaView;


/**
 * 老人请假
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface LaorenqingjiaDao extends BaseMapper<LaorenqingjiaEntity> {
	
	List<LaorenqingjiaVO> selectListVO(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
	
	LaorenqingjiaVO selectVO(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
	
	List<LaorenqingjiaView> selectListView(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);

	List<LaorenqingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
	
	LaorenqingjiaView selectView(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
	

}
