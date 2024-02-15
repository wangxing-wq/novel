package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.Comments;
import com.wx.novel.novels.service.CommentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 评论表(comments)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/comments")
public class CommentsController {
    /**
     * 服务对象
     */
    @Resource
    private CommentsService commentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Comments selectOne(Integer id) {
        return commentsService.getById(id);
    }

}
