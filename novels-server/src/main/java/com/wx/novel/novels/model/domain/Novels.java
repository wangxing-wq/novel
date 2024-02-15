package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

@Data
@TableName(value = "novels")
public class Novels {

    /**
     * 小说ID
     */
    @TableId(value = "novel_id", type = IdType.INPUT)
    private Long novelId;

    /**
     * 小说标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 作者
     */
    @TableField(value = "author")
    private String author;

    /**
     * 类别
     */
    @TableField(value = "genre")
    private String genre;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 封面图片URL
     */
    @TableField(value = "cover_image_url")
    private String coverImageUrl;

    /**
     * 状态
     */
    @TableField(value = "`STATUS`")
    private String status;

    /**
     * 字数
     */
    @TableField(value = "word_count")
    private Integer wordCount;

    /**
     * 评分
     */
    @TableField(value = "rating")
    private BigDecimal rating;

    /**
     * 收藏数
     */
    @TableField(value = "favorites_count")
    private Integer favoritesCount;

    /**
     * 阅读量
     */
    @TableField(value = "views_count")
    private Integer viewsCount;

    /**
     * 评论数
     */
    @TableField(value = "comments_count")
    private Integer commentsCount;

    /**
     * 点赞数
     */
    @TableField(value = "likes_count")
    private Integer likesCount;


    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private LocalDateTime updatedTime;

}
