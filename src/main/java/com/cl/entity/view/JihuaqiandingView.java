package com.cl.entity.view;

import com.cl.entity.JihuaqiandingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 计划签订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-20 14:25:30
 */
@TableName("jihuaqianding")
public class JihuaqiandingView  extends JihuaqiandingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JihuaqiandingView(){
	}
 
 	public JihuaqiandingView(JihuaqiandingEntity jihuaqiandingEntity){
 	try {
			BeanUtils.copyProperties(this, jihuaqiandingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
