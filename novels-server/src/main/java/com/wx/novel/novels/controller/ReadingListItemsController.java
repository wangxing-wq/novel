package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.ReadingListItems;
import com.wx.novel.novels.service.ReadingListItemsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (reading_list_items)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/reading_list_items")
public class ReadingListItemsController {
    /**
     * 服务对象
     */
    @Resource
    private ReadingListItemsService readingListItemsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ReadingListItems selectOne(Integer id) {
        return readingListItemsService.getById(id);
    }

}
