package com.wx.novel.novels.controller;

import com.wx.novel.novels.model.domain.Bookshelves;
import com.wx.novel.novels.service.BookshelvesService;
import com.wx.novel.novels.service.impl.BookshelvesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (bookshelves)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/bookshelves")
public class BookshelvesController {
    /**
     * 服务对象
     */
    @Resource
    private BookshelvesService bookshelvesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Bookshelves selectOne(Integer id) {
        return bookshelvesService.getById(id);
    }

}
