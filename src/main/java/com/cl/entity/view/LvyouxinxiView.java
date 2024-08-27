package com.cl.entity.view;

import com.cl.entity.LvyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 旅游信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-20 14:25:29
 */
@TableName("lvyouxinxi")
public class LvyouxinxiView  extends LvyouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyouxinxiView(){
	}
 
 	public LvyouxinxiView(LvyouxinxiEntity lvyouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lvyouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
