package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengritixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengritixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengritixingView;


/**
 * 生日提醒
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface ShengritixingService extends IService<ShengritixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengritixingVO> selectListVO(Wrapper<ShengritixingEntity> wrapper);
   	
   	ShengritixingVO selectVO(@Param("ew") Wrapper<ShengritixingEntity> wrapper);
   	
   	List<ShengritixingView> selectListView(Wrapper<ShengritixingEntity> wrapper);
   	
   	ShengritixingView selectView(@Param("ew") Wrapper<ShengritixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengritixingEntity> wrapper);
   	

}

