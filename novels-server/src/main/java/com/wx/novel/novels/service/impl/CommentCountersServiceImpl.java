package com.wx.novel.novels.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.novels.mapper.CommentCountersMapper;
import com.wx.novel.novels.model.domain.CommentCounters;
import com.wx.novel.novels.service.CommentCountersService;
import org.springframework.stereotype.Service;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

@Service
public class CommentCountersServiceImpl extends ServiceImpl<CommentCountersMapper, CommentCounters> implements CommentCountersService {

}
