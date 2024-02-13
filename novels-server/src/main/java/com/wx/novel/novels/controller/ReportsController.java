package com.wx.novel.novels.controller;
import com.wx.novel.novels.model.domain.Reports;
import com.wx.novel.novels.service.ReportsService;
import com.wx.novel.novels.service.impl.ReportsServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (reports)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/reports")
public class ReportsController {
/**
* 服务对象
*/
@Resource
private ReportsService reportsService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Reports selectOne(Integer id) {
return reportsService.getById(id);
}

}
