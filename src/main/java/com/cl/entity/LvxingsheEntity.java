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
 * 旅行社
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
@TableName("lvxingshe")
public class LvxingsheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvxingsheEntity() {
		
	}
	
	public LvxingsheEntity(T t) {
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
	 * 旅行社账号
	 */
					
	private String lvxingshezhanghao;
	
	/**
	 * 旅行社密码
	 */
					
	private String lvxingshemima;
	
	/**
	 * 旅行社姓名
	 */
					
	private String lvxingshexingming;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	
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
	 * 设置：旅行社账号
	 */
	public void setLvxingshezhanghao(String lvxingshezhanghao) {
		this.lvxingshezhanghao = lvxingshezhanghao;
	}
	/**
	 * 获取：旅行社账号
	 */
	public String getLvxingshezhanghao() {
		return lvxingshezhanghao;
	}
	/**
	 * 设置：旅行社密码
	 */
	public void setLvxingshemima(String lvxingshemima) {
		this.lvxingshemima = lvxingshemima;
	}
	/**
	 * 获取：旅行社密码
	 */
	public String getLvxingshemima() {
		return lvxingshemima;
	}
	/**
	 * 设置：旅行社姓名
	 */
	public void setLvxingshexingming(String lvxingshexingming) {
		this.lvxingshexingming = lvxingshexingming;
	}
	/**
	 * 获取：旅行社姓名
	 */
	public String getLvxingshexingming() {
		return lvxingshexingming;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}

}