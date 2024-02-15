package com.wx.novel.approval.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author 王兴
 * 2024/2/13 16-44
 * @description:
 */

@Data
@TableName(value = "applications")
public class Applications {
    /**
     * 申请ID
     */
    @TableId(value = "application_id", type = IdType.INPUT)
    private Long applicationId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 流程ID
     */
    @TableField(value = "process_id")
    private Long processId;

    /**
     * 状态
     */
    @TableField(value = "`STATUS`")
    private Object status;

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
