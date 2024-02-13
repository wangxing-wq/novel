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
@TableName(value = "reports")
public class Reports {
    /**
     * 举报ID
     */
    @TableId(value = "report_id", type = IdType.INPUT)
    private Long reportId;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 用户名称
     */
    @TableField(value = "user_name")
    private Integer userName;

    /**
     * 小说ID
     */
    @TableField(value = "novel_id")
    private Integer novelId;

    /**
     * 小说名称
     */
    @TableField(value = "novel_name")
    private Integer novelName;

    /**
     * 举报原因
     */
    @TableField(value = "reason")
    private String reason;

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