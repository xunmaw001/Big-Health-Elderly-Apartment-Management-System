package com.dao;

import com.entity.JiedaidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedaidengjiVO;
import com.entity.view.JiedaidengjiView;


/**
 * 接待登记
 * 
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface JiedaidengjiDao extends BaseMapper<JiedaidengjiEntity> {
	
	List<JiedaidengjiVO> selectListVO(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
	
	JiedaidengjiVO selectVO(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
	
	List<JiedaidengjiView> selectListView(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);

	List<JiedaidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
	
	JiedaidengjiView selectView(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
	

}
