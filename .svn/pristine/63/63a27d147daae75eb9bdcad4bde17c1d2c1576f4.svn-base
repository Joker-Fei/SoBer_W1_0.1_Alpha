package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Company;
import com.entity.News;
import com.tools.DBTools;

public class NewsDao {

	DBTools dbTools=new DBTools();
	// 查找的通用方法（返回一个集合）
		public List<News> findBySQL(String sql, Object[] params) {
			List<News> list = new ArrayList<News>();
			ResultSet rs = dbTools.executeQuery(sql, params);
			try {
				while (rs.next()) {
					News news = new News(rs.getInt("id"), rs.getString("title"),rs.getString("content"),rs.getDate("time"));
					list.add(news);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbTools.closeAll();
			}
			return list;
		}
		
		
		public List<News> findAll() {
			 String sql="select id,title,content,time from news";
			return findBySQL(sql, null);
		}


		public News findById(String id) {

			String sql="select id,title,content,time from news where id=? order by id desc";
			Object[] params={id};
			List<News> newsList=findBySQL(sql, params);
			if (newsList != null && newsList.size() > 0) {
				return newsList.get(0);
			}
			return null;
		}

}
