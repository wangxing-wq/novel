package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @description: 
 * @author 王兴
 * 2024/2/13 16-37
 */

/**
 * 计数类表
 */
@Data
@TableName(value = "comment_counters")
public class CommentCounters {
    @TableId(value = "post_id", type = IdType.INPUT)
    private Long postId;

    /**
     * 总评论数
     */
    @TableField(value = "total_comments")
    private Integer totalComments;

    /**
     * 根评论数
     */
    @TableField(value = "root_comments")
    private Integer rootComments;

    /**
     * 子评论数
     */
    @TableField(value = "sub_comments")
    private Integer subComments;

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
}