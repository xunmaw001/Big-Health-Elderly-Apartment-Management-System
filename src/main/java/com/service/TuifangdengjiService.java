package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuifangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuifangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuifangdengjiView;


/**
 * 退房登记
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface TuifangdengjiService extends IService<TuifangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuifangdengjiVO> selectListVO(Wrapper<TuifangdengjiEntity> wrapper);
   	
   	TuifangdengjiVO selectVO(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
   	
   	List<TuifangdengjiView> selectListView(Wrapper<TuifangdengjiEntity> wrapper);
   	
   	TuifangdengjiView selectView(@Param("ew") Wrapper<TuifangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuifangdengjiEntity> wrapper);
   	

}

