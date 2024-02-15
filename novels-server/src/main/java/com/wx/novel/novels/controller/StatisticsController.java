package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.Statistics;
import com.wx.novel.novels.service.StatisticsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (statistics)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    /**
     * 服务对象
     */
    @Resource
    private StatisticsService statisticsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Statistics selectOne(Integer id) {
        return statisticsService.getById(id);
    }

}
