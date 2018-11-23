package com.yourxiong.controller;

import com.yourxiong.pojo.News;
import com.yourxiong.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
//使用EnableCaching开启缓存
@RestController
@EnableCaching
public class NewsController {
    @Autowired
    private NewService newService;
    @RequestMapping("/all")
    public List<News> getAll(){
        return newService.getAll();
    }
    @GetMapping("/{t}")
    public String test(@PathParam("t")String t){
        return "t is "+t;
    }
}
