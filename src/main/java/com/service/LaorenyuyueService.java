package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaorenyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaorenyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaorenyuyueView;


/**
 * 老人预约
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface LaorenyuyueService extends IService<LaorenyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaorenyuyueVO> selectListVO(Wrapper<LaorenyuyueEntity> wrapper);
   	
   	LaorenyuyueVO selectVO(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
   	
   	List<LaorenyuyueView> selectListView(Wrapper<LaorenyuyueEntity> wrapper);
   	
   	LaorenyuyueView selectView(@Param("ew") Wrapper<LaorenyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaorenyuyueEntity> wrapper);
   	

}

