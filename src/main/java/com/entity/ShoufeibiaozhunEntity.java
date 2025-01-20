package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 收费标准
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("shoufeibiaozhun")
public class ShoufeibiaozhunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShoufeibiaozhunEntity() {
		
	}
	
	public ShoufeibiaozhunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 收费价格
	 */
					
	private Float shoufeijiage;
	
	/**
	 * 收费说明
	 */
					
	private String shoufeishuoming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
