package com.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.entity.Message;
import com.service.MessageService;

public class IOSMessageServlet  extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public IOSMessageServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
 
   
	public void init() throws ServletException {
		// Put your code here
	}

//	http://localhost:8080/SoBer_W1_0.1_Alpha/message?Msg1=more
	//消息
		public String message(){
			
			HttpServletRequest request = ServletActionContext.getRequest();
			
			String requestStr = request.getParameter("Msg1");
			System.out.println(requestStr);
			if(requestStr.equals("read")){//接收来自前端的read和id，向前端传送详细信息，即:id,title,content
				
				String id = request.getParameter("Msg2");//来自前端的用户点击的具体的新闻信息的id
				
				MessageService messageService=new MessageService();
				Message message=messageService.findById(id);
				
				int messageId=message.getId();
				String messageTitle=message.getTitle();
				String messageContent=message.getContent();
				Date messageTime=message.getReadtime();
				
				
				JSONObject jsonResultAll=new JSONObject();
				JSONObject jsonResult=new JSONObject();
				
				jsonResult.put("id", messageId);
				jsonResult.put("title", messageTitle);
				jsonResult.put("content",messageContent);
				jsonResult.put("time",messageTime);
				
				jsonResultAll.put("date", jsonResult);
				String jsonStr = jsonResult.toString();
				request.setAttribute("json", jsonStr);
				
				return "IOSmessage";
				
			}else if(requestStr.equals("more")){//点击“更多”，此处接收来自前端 的more然后向前端返还id和title这两个字符串
				
				MessageService messageService=new MessageService();
				List<Message> messageList=messageService.findAll();
				
				List<Map<String, String>> list = new ArrayList<Map<String, String>>();
				
				for(int i=0;i<messageList.size();i++){
					int messageId=(int)messageList.get(i).getId();
					String messageTitle=messageList.get(i).getContent();
					Date messageTime=messageList.get(i).getReadtime();
					
					Map<String, String> map = new HashMap<String, String>();
					
					map.put("id", String.valueOf(messageId));
					map.put("title",messageTitle);
					map.put("date",String.valueOf(messageTime));
					
					list.add(map);
				} 
				JSONObject jsonResultAll=new JSONObject();
				JSONObject jsonResult=new JSONObject();
				JSONArray outArray=JSONArray.fromObject(list);
				jsonResult.put("message", outArray);
				jsonResultAll.put("date", jsonResult);
				String jsonStr = jsonResultAll.toString();
				request.setAttribute("json",jsonStr);
				return "IOSmessage";
			}
			return "IOSmessage";
		}
		

	}
