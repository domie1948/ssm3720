package com.entity.model;

import com.entity.DingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-22
 */
public class DingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
     * 备注
     */
    private String youxigonglueContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单编号
	 */
    public String getDingdanBianhao() {
        return dingdanBianhao;
    }


    /**
	 * 设置：订单编号
	 */
    public void setDingdanBianhao(String dingdanBianhao) {
        this.dingdanBianhao = dingdanBianhao;
    }
    /**
	 * 获取：客户名称
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：客户名称
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：定制品名称
	 */
    public String getDingdanName() {
        return dingdanName;
    }


    /**
	 * 设置：定制品名称
	 */
    public void setDingdanName(String dingdanName) {
        this.dingdanName = dingdanName;
    }
    /**
	 * 获取：订购数量
	 */
    public Integer getDingdanNumber() {
        return dingdanNumber;
    }


    /**
	 * 设置：订购数量
	 */
    public void setDingdanNumber(Integer dingdanNumber) {
        this.dingdanNumber = dingdanNumber;
    }
    /**
	 * 获取：签订时间
	 */
    public Date getDingdanTime() {
        return dingdanTime;
    }


    /**
	 * 设置：签订时间
	 */
    public void setDingdanTime(Date dingdanTime) {
        this.dingdanTime = dingdanTime;
    }
    /**
	 * 获取：订单总额
	 */
    public Double getDingdanMoney() {
        return dingdanMoney;
    }


    /**
	 * 设置：订单总额
	 */
    public void setDingdanMoney(Double dingdanMoney) {
        this.dingdanMoney = dingdanMoney;
    }
    /**
	 * 获取：订单状态
	 */
    public Integer getDingdanTypes() {
        return dingdanTypes;
    }


    /**
	 * 设置：订单状态
	 */
    public void setDingdanTypes(Integer dingdanTypes) {
        this.dingdanTypes = dingdanTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getYouxigonglueContent() {
        return youxigonglueContent;
    }


    /**
	 * 设置：备注
	 */
    public void setYouxigonglueContent(String youxigonglueContent) {
        this.youxigonglueContent = youxigonglueContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
