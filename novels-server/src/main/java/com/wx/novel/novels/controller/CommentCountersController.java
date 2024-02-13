package com.wx.novel.novels.controller;
import com.wx.novel.novels.model.domain.CommentCounters;
import com.wx.novel.novels.service.CommentCountersService;
import com.wx.novel.novels.service.impl.CommentCountersServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* 计数类表(comment_counters)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/comment_counters")
public class CommentCountersController {
/**
* 服务对象
*/
@Resource
private CommentCountersService commentCountersService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public CommentCounters selectOne(Integer id) {
return commentCountersService.getById(id);
}

}
