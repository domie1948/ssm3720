package com.entity.model;

import com.entity.DingdanLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 售后服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-22
 */
public class DingdanLiuyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 定制品名称
     */
    private Integer dingdanId;


    /**
     * 反馈用户
     */
    private Integer yonghuId;


    /**
     * 反馈内容
     */
    private String dingdanLiuyanContent;


    /**
     * 回复内容
     */
    private String replyContent;


    /**
     * 讨论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：定制品名称
	 */
    public Integer getDingdanId() {
        return dingdanId;
    }


    /**
	 * 设置：定制品名称
	 */
    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }
    /**
	 * 获取：反馈用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：反馈用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：反馈内容
	 */
    public String getDingdanLiuyanContent() {
        return dingdanLiuyanContent;
    }


    /**
	 * 设置：反馈内容
	 */
    public void setDingdanLiuyanContent(String dingdanLiuyanContent) {
        this.dingdanLiuyanContent = dingdanLiuyanContent;
    }
    /**
	 * 获取：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 设置：回复内容
	 */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 获取：讨论时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：讨论时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
