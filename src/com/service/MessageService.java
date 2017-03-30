package com.service;

import java.util.List;

import com.dao.MessageDao;
import com.entity.Message;
 

public class MessageService {
	public List<Message> findAll(){
		return new MessageDao().findAll();
	}
 
	public Message findById(String id){
		return new MessageDao().findById(id);
	}
}
