package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

@Data
@TableName(value = "novel_tags")
public class NovelTags {
    /**
     * 标签ID
     */
    @TableId(value = "tag_id", type = IdType.INPUT)
    private Long tagId;

    /**
     * 标签名称
     */
    @TableField(value = "tag_name")
    private String tagName;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    /**
     * 使用次数
     */
    @TableField(value = "usage_count")
    private Integer usageCount;

    /**
     * 关联小说数量
     */
    @TableField(value = "associated_novels_count")
    private Integer associatedNovelsCount;
}
