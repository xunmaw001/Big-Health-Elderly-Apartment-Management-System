package com.entity.view;

import com.entity.JiedaidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 接待登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("jiedaidengji")
public class JiedaidengjiView  extends JiedaidengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiedaidengjiView(){
	}
 
 	public JiedaidengjiView(JiedaidengjiEntity jiedaidengjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiedaidengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
