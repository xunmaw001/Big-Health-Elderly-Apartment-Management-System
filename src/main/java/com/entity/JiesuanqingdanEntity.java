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
 * 结算清单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
@TableName("jiesuanqingdan")
public class JiesuanqingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiesuanqingdanEntity() {
		
	}
	
	public JiesuanqingdanEntity(T t) {
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
	 * 清单编号
	 */
					
	private String qingdanbianhao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 押金
	 */
					
	private Integer yajin;
	
	/**
	 * 其它费用
	 */
					
	private Integer qitafeiyong;
	
	/**
	 * 续住费用
	 */
					
	private Integer xuzhufeiyong;
	
	/**
	 * 住宿费
	 */
					
	private Integer zhusufei;
	
	/**
	 * 退住费用
	 */
					
	private Integer tuizhufeiyong;
	
	/**
	 * 总费用
	 */
					
	private Integer zongfeiyong;
	
	/**
	 * 录入时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lurushijian;
	
	/**
	 * 收费账号
	 */
					
	private String shoufeizhanghao;
	
	/**
	 * 收费姓名
	 */
					
	private String shoufeixingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：清单编号
	 */
	public void setQingdanbianhao(String qingdanbianhao) {
		this.qingdanbianhao = qingdanbianhao;
	}
	/**
	 * 获取：清单编号
	 */
	public String getQingdanbianhao() {
		return qingdanbianhao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：押金
	 */
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
	/**
	 * 设置：其它费用
	 */
	public void setQitafeiyong(Integer qitafeiyong) {
		this.qitafeiyong = qitafeiyong;
	}
	/**
	 * 获取：其它费用
	 */
	public Integer getQitafeiyong() {
		return qitafeiyong;
	}
	/**
	 * 设置：续住费用
	 */
	public void setXuzhufeiyong(Integer xuzhufeiyong) {
		this.xuzhufeiyong = xuzhufeiyong;
	}
	/**
	 * 获取：续住费用
	 */
	public Integer getXuzhufeiyong() {
		return xuzhufeiyong;
	}
	/**
	 * 设置：住宿费
	 */
	public void setZhusufei(Integer zhusufei) {
		this.zhusufei = zhusufei;
	}
	/**
	 * 获取：住宿费
	 */
	public Integer getZhusufei() {
		return zhusufei;
	}
	/**
	 * 设置：退住费用
	 */
	public void setTuizhufeiyong(Integer tuizhufeiyong) {
		this.tuizhufeiyong = tuizhufeiyong;
	}
	/**
	 * 获取：退住费用
	 */
	public Integer getTuizhufeiyong() {
		return tuizhufeiyong;
	}
	/**
	 * 设置：总费用
	 */
	public void setZongfeiyong(Integer zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	/**
	 * 获取：总费用
	 */
	public Integer getZongfeiyong() {
		return zongfeiyong;
	}
	/**
	 * 设置：录入时间
	 */
	public void setLurushijian(Date lurushijian) {
		this.lurushijian = lurushijian;
	}
	/**
	 * 获取：录入时间
	 */
	public Date getLurushijian() {
		return lurushijian;
	}
	/**
	 * 设置：收费账号
	 */
	public void setShoufeizhanghao(String shoufeizhanghao) {
		this.shoufeizhanghao = shoufeizhanghao;
	}
	/**
	 * 获取：收费账号
	 */
	public String getShoufeizhanghao() {
		return shoufeizhanghao;
	}
	/**
	 * 设置：收费姓名
	 */
	public void setShoufeixingming(String shoufeixingming) {
		this.shoufeixingming = shoufeixingming;
	}
	/**
	 * 获取：收费姓名
	 */
	public String getShoufeixingming() {
		return shoufeixingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
