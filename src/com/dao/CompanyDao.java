package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Company;
 
import com.tools.DBTools;

public class CompanyDao {

	DBTools dbTools=new DBTools();
	
	//查找新闻内容
	public List<Company> findAll() {

	/*	String sql="select * from companyinfo";*/
			String sql="select id,content from companyinfo";
		return findBySQL(sql, null);
	}

	public Company findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	// 查找的通用方法（返回一个集合）
		public List<Company> findBySQL(String sql, Object[] params) {
			List<Company> list = new ArrayList<Company>();
			ResultSet rs = dbTools.executeQuery(sql, params);
			try {
				while (rs.next()) {
					Company compay = new Company(
							rs.getInt("id"), rs.getString("content"));
					list.add(compay);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbTools.closeAll();
			}
			return list;
		}

}
