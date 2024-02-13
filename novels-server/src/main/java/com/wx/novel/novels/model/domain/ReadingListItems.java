package com.wx.novel.novels.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

@Data
@TableName(value = "reading_list_items")
public class ReadingListItems {
    /**
     * 书单项ID
     */
    @TableId(value = "list_item_id", type = IdType.INPUT)
    private Integer listItemId;

    /**
     * 书单ID
     */
    @TableField(value = "list_id")
    private Integer listId;

    /**
     * 小说ID
     */
    @TableField(value = "novel_id")
    private Integer novelId;

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