package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedaidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedaidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedaidengjiView;


/**
 * 接待登记
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public interface JiedaidengjiService extends IService<JiedaidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedaidengjiVO> selectListVO(Wrapper<JiedaidengjiEntity> wrapper);
   	
   	JiedaidengjiVO selectVO(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
   	
   	List<JiedaidengjiView> selectListView(Wrapper<JiedaidengjiEntity> wrapper);
   	
   	JiedaidengjiView selectView(@Param("ew") Wrapper<JiedaidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedaidengjiEntity> wrapper);
   	

}

