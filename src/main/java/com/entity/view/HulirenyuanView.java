package com.entity.view;

import com.entity.HulirenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 护理人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("hulirenyuan")
public class HulirenyuanView  extends HulirenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HulirenyuanView(){
	}
 
 	public HulirenyuanView(HulirenyuanEntity hulirenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, hulirenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
