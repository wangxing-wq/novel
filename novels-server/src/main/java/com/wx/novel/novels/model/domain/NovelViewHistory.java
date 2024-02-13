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
@TableName(value = "novel_view_history")
public class NovelViewHistory {
    /**
     * 浏览记录ID
     */
    @TableId(value = "view_id", type = IdType.INPUT)
    private Long viewId;

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