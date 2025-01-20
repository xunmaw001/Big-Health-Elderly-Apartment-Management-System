package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiesuanqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiesuanqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiesuanqingdanView;


/**
 * 结算清单
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface JiesuanqingdanService extends IService<JiesuanqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiesuanqingdanVO> selectListVO(Wrapper<JiesuanqingdanEntity> wrapper);
   	
   	JiesuanqingdanVO selectVO(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
   	
   	List<JiesuanqingdanView> selectListView(Wrapper<JiesuanqingdanEntity> wrapper);
   	
   	JiesuanqingdanView selectView(@Param("ew") Wrapper<JiesuanqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiesuanqingdanEntity> wrapper);
   	

}

