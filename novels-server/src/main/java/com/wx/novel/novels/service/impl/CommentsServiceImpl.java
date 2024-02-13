package com.wx.novel.novels.service.impl;

import com.wx.novel.novels.service.CommentsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.novels.model.domain.Comments;
import com.wx.novel.novels.mapper.CommentsMapper;

/**
 * @description:
 * @author 王兴
 * 2024/2/13 16-37
 */

@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {

}
