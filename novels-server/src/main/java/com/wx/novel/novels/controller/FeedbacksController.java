package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.Feedbacks;
import com.wx.novel.novels.service.FeedbacksService;
import com.wx.novel.novels.service.impl.FeedbacksServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (feedbacks)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/feedbacks")
public class FeedbacksController {
    /**
     * 服务对象
     */
    @Resource
    private FeedbacksService feedbacksService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Feedbacks selectOne(Integer id) {
        return feedbacksService.getById(id);
    }

}
