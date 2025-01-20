package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoufeirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoufeirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoufeirenyuanView;


/**
 * 收费人员
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface ShoufeirenyuanService extends IService<ShoufeirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoufeirenyuanVO> selectListVO(Wrapper<ShoufeirenyuanEntity> wrapper);
   	
   	ShoufeirenyuanVO selectVO(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
   	
   	List<ShoufeirenyuanView> selectListView(Wrapper<ShoufeirenyuanEntity> wrapper);
   	
   	ShoufeirenyuanView selectView(@Param("ew") Wrapper<ShoufeirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoufeirenyuanEntity> wrapper);
   	

}

