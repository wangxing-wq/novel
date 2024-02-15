package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 小说服务
 */
@SpringBootApplication(scanBasePackages = {"com.wx.novel.novels","com.wx.common"})
@MapperScan("com.wx.novel.novels.mapper")
public class NovelsApp {

    public static void main(String[] args) {
        SpringApplication.run(NovelsApp.class, args);
    }

}
