package com.entity.view;

import com.entity.ShengritixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生日提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
@TableName("shengritixing")
public class ShengritixingView  extends ShengritixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengritixingView(){
	}
 
 	public ShengritixingView(ShengritixingEntity shengritixingEntity){
 	try {
			BeanUtils.copyProperties(this, shengritixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
