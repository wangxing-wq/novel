package com.wx.novel.novels.controller;
import com.wx.novel.novels.model.domain.Novels;
import com.wx.novel.novels.service.NovelsService;
import com.wx.novel.novels.service.impl.NovelsServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (novels)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/novels")
public class NovelsController {
/**
* 服务对象
*/
@Resource
private NovelsService novelsService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Novels selectOne(Integer id) {
return novelsService.getById(id);
}

}
