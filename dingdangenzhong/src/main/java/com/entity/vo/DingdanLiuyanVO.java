package com.entity.vo;

import com.entity.DingdanLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 售后服务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-22
 */
@TableName("dingdan_liuyan")
public class DingdanLiuyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 定制品名称
     */

    @TableField(value = "dingdan_id")
    private Integer dingdanId;


    /**
     * 反馈用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 反馈内容
     */

    @TableField(value = "dingdan_liuyan_content")
    private String dingdanLiuyanContent;


    /**
     * 回复内容
     */

    @TableField(value = "reply_content")
    private String replyContent;


    /**
     * 讨论时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：定制品名称
	 */
    public Integer getDingdanId() {
        return dingdanId;
    }


    /**
	 * 获取：定制品名称
	 */

    public void setDingdanId(Integer dingdanId) {
        this.dingdanId = dingdanId;
    }
    /**
	 * 设置：反馈用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：反馈用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：反馈内容
	 */
    public String getDingdanLiuyanContent() {
        return dingdanLiuyanContent;
    }


    /**
	 * 获取：反馈内容
	 */

    public void setDingdanLiuyanContent(String dingdanLiuyanContent) {
        this.dingdanLiuyanContent = dingdanLiuyanContent;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 设置：讨论时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：讨论时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
