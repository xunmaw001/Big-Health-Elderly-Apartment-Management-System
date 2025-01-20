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
 * 房间信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
@TableName("fangjianxinxi")
public class FangjianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangjianxinxiEntity() {
		
	}
	
	public FangjianxinxiEntity(T t) {
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
	 * 房间号
	 */
					
	private String fangjianhao;
	
	/**
	 * 楼层
	 */
					
	private String louceng;
	
	/**
	 * 客房类型
	 */
					
	private String kefangleixing;
	
	/**
	 * 房间图片
	 */
					
	private String fangjiantupian;
	
	/**
	 * 房间面积
	 */
					
	private String fangjianmianji;
	
	/**
	 * 房间状态
	 */
					
	private String fangjianzhuangtai;
	
	/**
	 * 空闲床位
	 */
					
	private Integer kongxianchuangwei;
	
	/**
	 * 房间环境
	 */
					
	private String fangjianhuanjing;
	
	/**
	 * 房间介绍
	 */
					
	private String fangjianjieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：房间号
	 */
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
	/**
	 * 设置：楼层
	 */
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
	/**
	 * 设置：客房类型
	 */
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
	/**
	 * 设置：房间图片
	 */
	public void setFangjiantupian(String fangjiantupian) {
		this.fangjiantupian = fangjiantupian;
	}
	/**
	 * 获取：房间图片
	 */
	public String getFangjiantupian() {
		return fangjiantupian;
	}
	/**
	 * 设置：房间面积
	 */
	public void setFangjianmianji(String fangjianmianji) {
		this.fangjianmianji = fangjianmianji;
	}
	/**
	 * 获取：房间面积
	 */
	public String getFangjianmianji() {
		return fangjianmianji;
	}
	/**
	 * 设置：房间状态
	 */
	public void setFangjianzhuangtai(String fangjianzhuangtai) {
		this.fangjianzhuangtai = fangjianzhuangtai;
	}
	/**
	 * 获取：房间状态
	 */
	public String getFangjianzhuangtai() {
		return fangjianzhuangtai;
	}
	/**
	 * 设置：空闲床位
	 */
	public void setKongxianchuangwei(Integer kongxianchuangwei) {
		this.kongxianchuangwei = kongxianchuangwei;
	}
	/**
	 * 获取：空闲床位
	 */
	public Integer getKongxianchuangwei() {
		return kongxianchuangwei;
	}
	/**
	 * 设置：房间环境
	 */
	public void setFangjianhuanjing(String fangjianhuanjing) {
		this.fangjianhuanjing = fangjianhuanjing;
	}
	/**
	 * 获取：房间环境
	 */
	public String getFangjianhuanjing() {
		return fangjianhuanjing;
	}
	/**
	 * 设置：房间介绍
	 */
	public void setFangjianjieshao(String fangjianjieshao) {
		this.fangjianjieshao = fangjianjieshao;
	}
	/**
	 * 获取：房间介绍
	 */
	public String getFangjianjieshao() {
		return fangjianjieshao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
