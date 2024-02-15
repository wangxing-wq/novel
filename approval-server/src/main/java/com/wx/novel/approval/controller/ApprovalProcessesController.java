package com.wx.novel.approval.controller;

import com.wx.novel.approval.model.domain.ApprovalProcesses;
import com.wx.novel.approval.service.ApprovalProcessesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (approval_processes)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/approval_processes")
public class ApprovalProcessesController {
    /**
     * 服务对象
     */
    @Resource
    private ApprovalProcessesService approvalProcessesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ApprovalProcesses selectOne(Integer id) {
        return approvalProcessesService.getById(id);
    }

}
