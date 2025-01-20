package com.entity.model;

import com.entity.RuzhudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 入住登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-10 10:39:39
 */
public class RuzhudengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 床位号
	 */
	
	private String chuangweihao;
		
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
	 * 入住状态
	 */
	
	private String ruzhuzhuangtai;
		
	/**
	 * 入住时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruzhushijian;
		
	/**
	 * 护理账号
	 */
	
	private String hulizhanghao;
		
	/**
	 * 护理姓名
	 */
	
	private String hulixingming;
				
	
	/**
	 * 设置：床位号
	 */
	 
	public void setChuangweihao(String chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	
	/**
	 * 获取：床位号
	 */
	public String getChuangweihao() {
		return chuangweihao;
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
	 * 设置：入住状态
	 */
	 
	public void setRuzhuzhuangtai(String ruzhuzhuangtai) {
		this.ruzhuzhuangtai = ruzhuzhuangtai;
	}
	
	/**
	 * 获取：入住状态
	 */
	public String getRuzhuzhuangtai() {
		return ruzhuzhuangtai;
	}
				
	
	/**
	 * 设置：入住时间
	 */
	 
	public void setRuzhushijian(Date ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}
	
	/**
	 * 获取：入住时间
	 */
	public Date getRuzhushijian() {
		return ruzhushijian;
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
