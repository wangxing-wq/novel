package com.wx.novel.novels.controller;
import com.wx.novel.novels.model.domain.Feedbacks;
import com.wx.novel.novels.service.impl.FeedbacksServiceImpl;
import org.springframework.web.bind.annotation.*;

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
private FeedbacksServiceImpl feedbacksServiceImpl;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Feedbacks selectOne(Integer id) {
return feedbacksServiceImpl.selectByPrimaryKey(id);
}

}
