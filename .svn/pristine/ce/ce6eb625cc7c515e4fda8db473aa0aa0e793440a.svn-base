package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import com.entity.Discount;
import com.entity.News;
import com.tools.DBTools;

public class DiscountDao {

	DBTools dbTools=new DBTools();
	// 查找的通用方法（返回一个集合）
		public List<Discount> findBySQL(String sql, Object[] params) {
			List<Discount> list = new ArrayList<Discount>();
			ResultSet rs = dbTools.executeQuery(sql, params);
			try {
				while (rs.next()) {
					Discount discount = new Discount(rs.getInt("id"), rs.getString("title"),rs.getString("content"),rs.getDate("time"));
					list.add(discount);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbTools.closeAll();
			}
			return list;
		}
		
		
		public List<Discount> findAll() {
			 String sql="select id,title,content,time from discount";
			return findBySQL(sql, null);
		}

		//此处可以查找title即标题名字
		public Discount findById(String id) {

			String sql="select id,title,content from discount where id=?";
			Object[] params={id};
			List<Discount> discountList=findBySQL(sql, params);
			if (discountList != null && discountList.size() > 0) {
				return discountList.get(0);
			}
			return null;
		}
}
