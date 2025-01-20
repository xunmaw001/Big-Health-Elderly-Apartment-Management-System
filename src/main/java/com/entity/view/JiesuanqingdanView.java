package com.entity.view;

import com.entity.JiesuanqingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 结算清单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
@TableName("jiesuanqingdan")
public class JiesuanqingdanView  extends JiesuanqingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiesuanqingdanView(){
	}
 
 	public JiesuanqingdanView(JiesuanqingdanEntity jiesuanqingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jiesuanqingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
