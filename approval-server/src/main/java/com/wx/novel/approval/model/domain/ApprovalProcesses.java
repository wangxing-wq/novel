package com.wx.novel.approval.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * @author 王兴
 * 2024/2/13 16-44
 * @description:
 */

@Data
@TableName(value = "approval_processes")
public class ApprovalProcesses {
    /**
     * 审批流程ID
     */
    @TableId(value = "process_id", type = IdType.INPUT)
    private Long processId;

    /**
     * 流程名称
     */
    @TableField(value = "process_name")
    private String processName;

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
}