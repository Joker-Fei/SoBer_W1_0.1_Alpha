package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Message;
import com.tools.DBTools;

public class MessageDao {

	DBTools dbTools=new DBTools();
	// 查找的通用方法（返回一个集合）
		public List<Message> findBySQL(String sql, Object[] params) {
			List<Message> list = new ArrayList<Message>();
			ResultSet rs = dbTools.executeQuery(sql, params);
			try {
				while (rs.next()) {
					Message Message = new Message(rs.getInt("id"), rs.getString("title"),rs.getString("content"),rs.getInt("type"),rs.getInt("driverid"),rs.getInt("mark"),rs.getDate("readtime"));
					list.add(Message);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				dbTools.closeAll();
			}
			return list;
		}
		
		
		public List<Message> findAll() {
			 String sql="select id,title,content,type,driverid,mark,readtime from message";
			return findBySQL(sql, null);
		}


		public Message findById(String id) {

			String sql="select id,title,content,type,driverid,mark,readtime from message where id=? order by id desc";
			Object[] params={id};
			List<Message> MessageList=findBySQL(sql, params);
			if (MessageList != null && MessageList.size() > 0) {
				return MessageList.get(0);
			}
			return null;
		}

}
