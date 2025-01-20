package com.entity.view;

import com.entity.JiedairenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接待人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("jiedairenyuan")
public class JiedairenyuanView  extends JiedairenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedairenyuanView(){
	}
 
 	public JiedairenyuanView(JiedairenyuanEntity jiedairenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiedairenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
