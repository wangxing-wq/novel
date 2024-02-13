package com.wx.novel.approval.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.approval.model.domain.Applications;
import com.wx.novel.approval.mapper.ApplicationsMapper;
import com.wx.novel.approval.service.ApplicationsService;
/**
 * @description: 
 * @author 王兴
 * 2024/2/13 16-44
 */

@Service
public class ApplicationsServiceImpl extends ServiceImpl<ApplicationsMapper, Applications> implements ApplicationsService{

}
