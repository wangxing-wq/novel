package com.wx.novel.novels.service.impl;

import com.wx.novel.novels.service.PostsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.novels.mapper.PostsMapper;
import com.wx.novel.novels.model.domain.Posts;

/**
 * @description:
 * @author 王兴
 * 2024/2/13 16-37
 */

@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements PostsService {

}
