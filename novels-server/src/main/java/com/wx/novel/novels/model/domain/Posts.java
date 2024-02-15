package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author 王兴
 * 2024/2/13 16-37
 */

/**
 * 帖子表
 */
@Data
@TableName(value = "posts")
public class Posts {
    @TableId(value = "post_id", type = IdType.INPUT)
    private Long postId;

    /**
     * 帖子标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 帖子内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 发帖用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 浏览量
     */
    @TableField(value = "views")
    private Integer views;

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
     * 评论数
     */
    @TableField(value = "comment_count")
    private Integer commentCount;

    /**
     * 是否置顶，0表示不置顶，1表示置顶
     */
    @TableField(value = "is_top")
    private Byte isTop;

    /**
     * 是否精华，0表示不精华，1表示精华
     */
    @TableField(value = "is_essence")
    private Byte isEssence;

    /**
     * 帖子状态
     */
    @TableField(value = "`status`")
    private Object status;

    /**
     * 帖子创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 帖子修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}
