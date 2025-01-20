package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedairenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedairenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedairenyuanView;


/**
 * 接待人员
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface JiedairenyuanService extends IService<JiedairenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedairenyuanVO> selectListVO(Wrapper<JiedairenyuanEntity> wrapper);
   	
   	JiedairenyuanVO selectVO(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
   	
   	List<JiedairenyuanView> selectListView(Wrapper<JiedairenyuanEntity> wrapper);
   	
   	JiedairenyuanView selectView(@Param("ew") Wrapper<JiedairenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedairenyuanEntity> wrapper);
   	

}

