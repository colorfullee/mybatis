package com.yourxiong.dao;

import com.yourxiong.pojo.News;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao {
    List<News> getAll();
}
