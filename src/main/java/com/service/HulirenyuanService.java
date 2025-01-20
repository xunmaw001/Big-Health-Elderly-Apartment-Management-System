package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HulirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HulirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HulirenyuanView;


/**
 * 护理人员
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface HulirenyuanService extends IService<HulirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HulirenyuanVO> selectListVO(Wrapper<HulirenyuanEntity> wrapper);
   	
   	HulirenyuanVO selectVO(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
   	
   	List<HulirenyuanView> selectListView(Wrapper<HulirenyuanEntity> wrapper);
   	
   	HulirenyuanView selectView(@Param("ew") Wrapper<HulirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HulirenyuanEntity> wrapper);
   	

}

