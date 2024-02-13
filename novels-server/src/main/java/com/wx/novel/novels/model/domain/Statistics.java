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
@TableName(value = "`statistics`")
public class Statistics {
    /**
     * 统计ID
     */
    @TableId(value = "stat_id", type = IdType.INPUT)
    private Long statId;

    /**
     * 指标名称
     */
    @TableField(value = "metric_name")
    private String metricName;

    /**
     * 指标值
     */
    @TableField(value = "metric_value")
    private Integer metricValue;

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