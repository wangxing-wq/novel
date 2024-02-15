package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.NovelViewHistory;
import com.wx.novel.novels.service.NovelViewHistoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (novel_view_history)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/novel_view_history")
public class NovelViewHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private NovelViewHistoryService novelViewHistoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NovelViewHistory selectOne(Integer id) {
        return novelViewHistoryService.getById(id);
    }

}
