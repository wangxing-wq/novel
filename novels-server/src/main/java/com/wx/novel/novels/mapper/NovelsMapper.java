package com.wx.novel.novels.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wx.novel.novels.crawler.TuishuVo;
import com.wx.novel.novels.model.domain.Novels;

import java.util.List;

/**
 * @author 王兴
 * 2024/2/13 16-37
 * @description:
 */

public interface NovelsMapper extends BaseMapper<Novels> {
    int insertBatch(List<Novels> data);
}
