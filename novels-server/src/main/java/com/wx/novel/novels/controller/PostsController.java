package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.Posts;
import com.wx.novel.novels.service.PostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 帖子表(posts)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/posts")
public class PostsController {
    /**
     * 服务对象
     */
    @Resource
    private PostsService postsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Posts selectOne(Integer id) {
        return postsService.getById(id);
    }

}
