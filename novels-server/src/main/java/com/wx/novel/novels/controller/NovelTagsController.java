package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.NovelTags;
import com.wx.novel.novels.service.NovelTagsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (novel_tags)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/novel_tags")
public class NovelTagsController {
    /**
     * 服务对象
     */
    @Resource
    private NovelTagsService novelTagsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NovelTags selectOne(Integer id) {
        return novelTagsService.getById(id);
    }

}
