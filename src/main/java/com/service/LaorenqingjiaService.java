package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaorenqingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaorenqingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaorenqingjiaView;


/**
 * 老人请假
 *
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public interface LaorenqingjiaService extends IService<LaorenqingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaorenqingjiaVO> selectListVO(Wrapper<LaorenqingjiaEntity> wrapper);
   	
   	LaorenqingjiaVO selectVO(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
   	
   	List<LaorenqingjiaView> selectListView(Wrapper<LaorenqingjiaEntity> wrapper);
   	
   	LaorenqingjiaView selectView(@Param("ew") Wrapper<LaorenqingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaorenqingjiaEntity> wrapper);
   	

}

