package com.entity.vo;

import com.entity.ShoufeibiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收费标准
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public class ShoufeibiaozhunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收费价格
	 */
	
	private Float shoufeijiage;
		
	/**
	 * 收费说明
	 */
	
	private String shoufeishuoming;
				
	
	/**
	 * 设置：收费价格
	 */
	 
	public void setShoufeijiage(Float shoufeijiage) {
		this.shoufeijiage = shoufeijiage;
	}
	
	/**
	 * 获取：收费价格
	 */
	public Float getShoufeijiage() {
		return shoufeijiage;
	}
				
	
	/**
	 * 设置：收费说明
	 */
	 
	public void setShoufeishuoming(String shoufeishuoming) {
		this.shoufeishuoming = shoufeishuoming;
	}
	
	/**
	 * 获取：收费说明
	 */
	public String getShoufeishuoming() {
		return shoufeishuoming;
	}
			
}
