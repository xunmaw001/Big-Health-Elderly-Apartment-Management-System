package com.entity.view;

import com.entity.ChuangweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 床位信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("chuangweixinxi")
public class ChuangweixinxiView  extends ChuangweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuangweixinxiView(){
	}
 
 	public ChuangweixinxiView(ChuangweixinxiEntity chuangweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chuangweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
