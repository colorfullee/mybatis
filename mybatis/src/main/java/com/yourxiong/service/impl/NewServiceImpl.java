package com.yourxiong.service.impl;

import com.yourxiong.dao.NewsDao;
import com.yourxiong.pojo.News;
import com.yourxiong.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@CacheConfig(cacheNames = "all")
@Service
public class NewServiceImpl implements NewService {
    @Autowired
    private NewsDao newsDao;
    @Cacheable(cacheNames = {"all"})
    @Override
    public List<News> getAll() {
        return newsDao.getAll();
    }
}
