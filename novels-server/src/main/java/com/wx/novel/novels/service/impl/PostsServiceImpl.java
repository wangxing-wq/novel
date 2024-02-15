package com.wx.novel.novels.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.novels.mapper.PostsMapper;
import com.wx.novel.novels.model.domain.Posts;
import com.wx.novel.novels.service.PostsService;
import org.springframework.stereotype.Service;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements PostsService {

}
