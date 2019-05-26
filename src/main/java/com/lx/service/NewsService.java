package com.lx.service;

import com.lx.pojo.News;

import java.util.List;

public interface NewsService {
    public int add(News news);
    public int update(News news);
    public void delete(News news);
    public List<News> listone(News news);
}
