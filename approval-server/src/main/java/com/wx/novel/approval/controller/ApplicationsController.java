package com.wx.novel.approval.controller;
import com.wx.novel.approval.model.domain.Applications;
import com.wx.novel.approval.service.ApplicationsService;
import com.wx.novel.approval.service.impl.ApplicationsServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (applications)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/applications")
public class ApplicationsController {
/**
* 服务对象
*/
@Resource
private ApplicationsService applicationsService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Applications selectOne(Integer id) {
return applicationsService.getById(id);
}

}
