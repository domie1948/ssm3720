package com.entity.view;

import com.entity.DingdanLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 售后服务
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-22
 */
@TableName("dingdan_liuyan")
public class DingdanLiuyanView extends DingdanLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 dingdan
			/**
			* 订单编号
			*/
			private String dingdanBianhao;
			/**
			* 客户名称
			*/
			private Integer yonghuId;
			/**
			* 定制品名称
			*/
			private String dingdanName;
			/**
			* 订购数量
			*/
			private Integer dingdanNumber;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 签订时间
			*/
			private Date dingdanTime;
			/**
			* 订单总额
			*/
			private Double dingdanMoney;
			/**
			* 订单状态
			*/
			private Integer dingdanTypes;
				/**
				* 订单状态的值
				*/
				private String dingdanValue;
			/**
			* 备注
			*/
			private String youxigonglueContent;

		//级联表 yonghu
			/**
			* 客户编号
			*/
			private String yonghuBianhao;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public DingdanLiuyanView() {

	}

	public DingdanLiuyanView(DingdanLiuyanEntity dingdanLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, dingdanLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set dingdan
					/**
					* 获取： 订单编号
					*/
					public String getDingdanBianhao() {
						return dingdanBianhao;
					}
					/**
					* 设置： 订单编号
					*/
					public void setDingdanBianhao(String dingdanBianhao) {
						this.dingdanBianhao = dingdanBianhao;
					}
					/**
					* 获取： 客户名称
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 客户名称
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 定制品名称
					*/
					public String getDingdanName() {
						return dingdanName;
					}
					/**
					* 设置： 定制品名称
					*/
					public void setDingdanName(String dingdanName) {
						this.dingdanName = dingdanName;
					}
					/**
					* 获取： 订购数量
					*/
					public Integer getDingdanNumber() {
						return dingdanNumber;
					}
					/**
					* 设置： 订购数量
					*/
					public void setDingdanNumber(Integer dingdanNumber) {
						this.dingdanNumber = dingdanNumber;
					}
					/**
					* 获取： 签订时间
					*/
					public Date getDingdanTime() {
						return dingdanTime;
					}
					/**
					* 设置： 签订时间
					*/
					public void setDingdanTime(Date dingdanTime) {
						this.dingdanTime = dingdanTime;
					}
					/**
					* 获取： 订单总额
					*/
					public Double getDingdanMoney() {
						return dingdanMoney;
					}
					/**
					* 设置： 订单总额
					*/
					public void setDingdanMoney(Double dingdanMoney) {
						this.dingdanMoney = dingdanMoney;
					}
					/**
					* 获取： 订单状态
					*/
					public Integer getDingdanTypes() {
						return dingdanTypes;
					}
					/**
					* 设置： 订单状态
					*/
					public void setDingdanTypes(Integer dingdanTypes) {
						this.dingdanTypes = dingdanTypes;
					}


						/**
						* 获取： 订单状态的值
						*/
						public String getDingdanValue() {
							return dingdanValue;
						}
						/**
						* 设置： 订单状态的值
						*/
						public void setDingdanValue(String dingdanValue) {
							this.dingdanValue = dingdanValue;
						}
					/**
					* 获取： 备注
					*/
					public String getYouxigonglueContent() {
						return youxigonglueContent;
					}
					/**
					* 设置： 备注
					*/
					public void setYouxigonglueContent(String youxigonglueContent) {
						this.youxigonglueContent = youxigonglueContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 客户编号
					*/
					public String getYonghuBianhao() {
						return yonghuBianhao;
					}
					/**
					* 设置： 客户编号
					*/
					public void setYonghuBianhao(String yonghuBianhao) {
						this.yonghuBianhao = yonghuBianhao;
					}
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}






}
