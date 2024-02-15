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
@TableName(value = "bookshelves")
public class Bookshelves {
    /**
     * 书架ID
     */
    @TableId(value = "shelf_id", type = IdType.INPUT)
    private Long shelfId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 小说ID
     */
    @TableField(value = "novel_id")
    private Long novelId;

    /**
     * 小说名称
     */
    @TableField(value = "novel_name")
    private String novelName;

    /**
     * 收藏夹名称
     */
    @TableField(value = "collection_name")
    private String collectionName;

    /**
     * 是否公开
     */
    @TableField(value = "is_public")
    private Byte isPublic;

    /**
     * 排序索引
     */
    @TableField(value = "order_index")
    private Integer orderIndex;

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
}
