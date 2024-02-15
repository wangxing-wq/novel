package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.ReadingLists;
import com.wx.novel.novels.service.ReadingListsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (reading_lists)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/reading_lists")
public class ReadingListsController {
    /**
     * 服务对象
     */
    @Resource
    private ReadingListsService readingListsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ReadingLists selectOne(Integer id) {
        return readingListsService.getById(id);
    }

}
