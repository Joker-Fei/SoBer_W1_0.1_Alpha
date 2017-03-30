package com.service;

import java.util.List;

 
import com.dao.NewsDao;
 
import com.entity.News;

public class NewsService {

	public List<News> findAll(){
		return new NewsDao().findAll();
	}
 
	public News findById(String id){
		return new NewsDao().findById(id);
	}
}
