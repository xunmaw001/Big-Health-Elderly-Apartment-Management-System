package com.entity.vo;

import com.entity.HulijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 护理记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-10 10:39:40
 */
public class HulijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 护理等级
	 */
	
	private String hulidengji;
		
	/**
	 * 护理内容
	 */
	
	private String hulineirong;
		
	/**
	 * 护理时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date hulishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 护理账号
	 */
	
	private String hulizhanghao;
		
	/**
	 * 护理姓名
	 */
	
	private String hulixingming;
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
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
	 * 设置：护理等级
	 */
	 
	public void setHulidengji(String hulidengji) {
		this.hulidengji = hulidengji;
	}
	
	/**
	 * 获取：护理等级
	 */
	public String getHulidengji() {
		return hulidengji;
	}
				
	
	/**
	 * 设置：护理内容
	 */
	 
	public void setHulineirong(String hulineirong) {
		this.hulineirong = hulineirong;
	}
	
	/**
	 * 获取：护理内容
	 */
	public String getHulineirong() {
		return hulineirong;
	}
				
	
	/**
	 * 设置：护理时间
	 */
	 
	public void setHulishijian(Date hulishijian) {
		this.hulishijian = hulishijian;
	}
	
	/**
	 * 获取：护理时间
	 */
	public Date getHulishijian() {
		return hulishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：护理账号
	 */
	 
	public void setHulizhanghao(String hulizhanghao) {
		this.hulizhanghao = hulizhanghao;
	}
	
	/**
	 * 获取：护理账号
	 */
	public String getHulizhanghao() {
		return hulizhanghao;
	}
				
	
	/**
	 * 设置：护理姓名
	 */
	 
	public void setHulixingming(String hulixingming) {
		this.hulixingming = hulixingming;
	}
	
	/**
	 * 获取：护理姓名
	 */
	public String getHulixingming() {
		return hulixingming;
	}
			
}
