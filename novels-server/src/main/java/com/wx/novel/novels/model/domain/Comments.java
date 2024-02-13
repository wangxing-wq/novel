package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * @description: 
 * @author 王兴
 * 2024/2/13 16-37
 */

/**
 * 评论表
 */
@Data
@TableName(value = "comments")
public class Comments {
    @TableId(value = "comment_id", type = IdType.INPUT)
    private Long commentId;

    /**
     * 评论者ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 父评论ID
     */
    @TableField(value = "parent_comment_id")
    private Integer parentCommentId;

    /**
     * 被评论的内容ID
     */
    @TableField(value = "post_id")
    private Long postId;

    /**
     * 评论状态
     */
    @TableField(value = "`STATUS`")
    private Object status;

    /**
     * 点赞数
     */
    @TableField(value = "likes")
    private Integer likes;

    /**
     * 点踩数
     */
    @TableField(value = "dislikes")
    private Integer dislikes;

    /**
     * 举报次数
     */
    @TableField(value = "reports")
    private Integer reports;

    /**
     * 评论者IP地址
     */
    @TableField(value = "user_ip")
    private String userIp;

    /**
     * 评论者设备信息
     */
    @TableField(value = "device_info")
    private String deviceInfo;

    /**
     * 审核人员ID
     */
    @TableField(value = "auditor_id")
    private Integer auditorId;

    /**
     * 评论标签
     */
    @TableField(value = "tags")
    private String tags;

    /**
     * 评论附件信息
     */
    @TableField(value = "attachments")
    private String attachments;

    /**
     * 回复数
     */
    @TableField(value = "reply_count")
    private Integer replyCount;

    /**
     * 评论创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 评论修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}