package com.wx.novel.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.novel.user.model.domain.UserProfiles;
import com.wx.novel.user.mapper.UserProfilesMapper;
import com.wx.novel.user.service.UserProfilesService;
/**
 * @description:
 * @author 王兴
 * 2024/2/13 16-46
 */

@Service
public class UserProfilesServiceImpl extends ServiceImpl<UserProfilesMapper, UserProfiles> implements UserProfilesService{

}
