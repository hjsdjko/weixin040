package com.cl.entity;

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
 * 旅游信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
@TableName("lvyouxinxi")
public class LvyouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyouxinxiEntity() {
		
	}
	
	public LvyouxinxiEntity(T t) {
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
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 交通方式
	 */
					
	private String jiaotongfangshi;
	
	/**
	 * 住宿
	 */
					
	private String zhusu;
	
	/**
	 * 景点推荐
	 */
					
	private String jingdiantuijian;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 旅游时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lvyoushijian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 团购价
	 */
					
	private Double groupprice;
	
	/**
	 * 拼团人数
	 */
					
	private Integer grouppeople;
	
	/**
	 * 当前人数
	 */
					
	private Integer curpeople;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 价格
	 */
					
	private Double price;
	
	
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
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：交通方式
	 */
	public void setJiaotongfangshi(String jiaotongfangshi) {
		this.jiaotongfangshi = jiaotongfangshi;
	}
	/**
	 * 获取：交通方式
	 */
	public String getJiaotongfangshi() {
		return jiaotongfangshi;
	}
	/**
	 * 设置：住宿
	 */
	public void setZhusu(String zhusu) {
		this.zhusu = zhusu;
	}
	/**
	 * 获取：住宿
	 */
	public String getZhusu() {
		return zhusu;
	}
	/**
	 * 设置：景点推荐
	 */
	public void setJingdiantuijian(String jingdiantuijian) {
		this.jingdiantuijian = jingdiantuijian;
	}
	/**
	 * 获取：景点推荐
	 */
	public String getJingdiantuijian() {
		return jingdiantuijian;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：旅游时间
	 */
	public void setLvyoushijian(Date lvyoushijian) {
		this.lvyoushijian = lvyoushijian;
	}
	/**
	 * 获取：旅游时间
	 */
	public Date getLvyoushijian() {
		return lvyoushijian;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：团购价
	 */
	public void setGroupprice(Double groupprice) {
		this.groupprice = groupprice;
	}
	/**
	 * 获取：团购价
	 */
	public Double getGroupprice() {
		return groupprice;
	}
	/**
	 * 设置：拼团人数
	 */
	public void setGrouppeople(Integer grouppeople) {
		this.grouppeople = grouppeople;
	}
	/**
	 * 获取：拼团人数
	 */
	public Integer getGrouppeople() {
		return grouppeople;
	}
	/**
	 * 设置：当前人数
	 */
	public void setCurpeople(Integer curpeople) {
		this.curpeople = curpeople;
	}
	/**
	 * 获取：当前人数
	 */
	public Integer getCurpeople() {
		return curpeople;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
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
	 * 设置：价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Double getPrice() {
		return price;
	}

}
