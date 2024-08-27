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
 * 旅游计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
@TableName("lvyoujihua")
public class LvyoujihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyoujihuaEntity() {
		
	}
	
	public LvyoujihuaEntity(T t) {
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
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 旅游时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lvyoushijian;
	
	/**
	 * 住宿
	 */
					
	private String zhusu;
	
	/**
	 * 预算
	 */
					
	private Double yusuan;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 旅行社账号
	 */
					
	private String lvxingshezhanghao;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	
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
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
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
	 * 设置：预算
	 */
	public void setYusuan(Double yusuan) {
		this.yusuan = yusuan;
	}
	/**
	 * 获取：预算
	 */
	public Double getYusuan() {
		return yusuan;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}

}
