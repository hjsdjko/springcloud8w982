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
 * 劳工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
@TableName("laogong")
public class LaogongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaogongEntity() {
		
	}
	
	public LaogongEntity(T t) {
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
	 * 劳工姓名
	 */
					
	private String laogongxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 工作年龄
	 */
					
	private String gongzuonianling;
	
	/**
	 * 专长
	 */
					
	private String zhuanzhang;
	
	/**
	 * 劳工介绍
	 */
					
	private String laogongjieshao;
	
	
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
	 * 设置：劳工姓名
	 */
	public void setLaogongxingming(String laogongxingming) {
		this.laogongxingming = laogongxingming;
	}
	/**
	 * 获取：劳工姓名
	 */
	public String getLaogongxingming() {
		return laogongxingming;
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
	 * 设置：工作年龄
	 */
	public void setGongzuonianling(String gongzuonianling) {
		this.gongzuonianling = gongzuonianling;
	}
	/**
	 * 获取：工作年龄
	 */
	public String getGongzuonianling() {
		return gongzuonianling;
	}
	/**
	 * 设置：专长
	 */
	public void setZhuanzhang(String zhuanzhang) {
		this.zhuanzhang = zhuanzhang;
	}
	/**
	 * 获取：专长
	 */
	public String getZhuanzhang() {
		return zhuanzhang;
	}
	/**
	 * 设置：劳工介绍
	 */
	public void setLaogongjieshao(String laogongjieshao) {
		this.laogongjieshao = laogongjieshao;
	}
	/**
	 * 获取：劳工介绍
	 */
	public String getLaogongjieshao() {
		return laogongjieshao;
	}

}
