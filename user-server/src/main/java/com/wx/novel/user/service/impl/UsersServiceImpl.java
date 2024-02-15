package com.wx.novel.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.user.mapper.UsersMapper;
import com.wx.novel.user.model.domain.Users;
import com.wx.novel.user.service.UsersService;
import org.springframework.stereotype.Service;

/**
 * @author 王兴
 * 2024/2/13 16-46
 * @description:
 */

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
