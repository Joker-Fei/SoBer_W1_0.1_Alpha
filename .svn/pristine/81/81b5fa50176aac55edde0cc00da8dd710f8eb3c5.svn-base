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

import com.entity.News;
import com.service.NewsService;

public class IOSNewsServlet extends HttpServlet {

//	http://localhost:8080/SoBer_W1_0.1_Alpha/news?Msg1=more
//	http://localhost:8080/SoBer_W1_0.1_Alpha/news?Msg1=read&Msg2=1  
	/**
	 * Constructor of the object.
	 */
	public IOSNewsServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>`
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

  
	public void init() throws ServletException {
		// Put your code here
	}
 

	//公司新闻
	public String news(){
		 
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String requestStr = request.getParameter("Msg1");
		System.out.println(requestStr);
		if(requestStr.equals("read")){//接收来自前端的read和id，向前端传送详细信息，即:id,title,content
			
			String id = request.getParameter("Msg2");//来自前端的用户点击的具体的新闻信息的id
		 
			NewsService newsService=new NewsService();
			News news=newsService.findById(id);
			
			int newsId=news.getId();
			String newsTitle=news.getTitle();
			String newsContent=news.getContent();
			Date newsTime=news.getTime();
			
			 
			JSONObject jsonResultAll=new JSONObject();
			JSONObject jsonResult=new JSONObject();
			
			 jsonResult.put("id", newsId);
			 jsonResult.put("title", newsTitle);
			 jsonResult.put("content",newsContent);
			 jsonResult.put("time",newsTime);
		 
			 jsonResultAll.put("date", jsonResult);
			 String jsonStr = jsonResultAll.toString();
			 request.setAttribute("json", jsonStr);
			 
			 return "IOSnews";
			
		}else if(requestStr.equals("more")){//点击“更多”，此处接收来自前端 的more然后向前端返还id和title这两个字符串
			
			NewsService newsService=new NewsService();
			List<News> newsList=newsService.findAll();
			
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		     
		    for(int i=0;i<newsList.size();i++){
		    	int newsId=(int)newsList.get(i).getId();
		    	String newsTitle=newsList.get(i).getTitle();
		    	Date newsTime=newsList.get(i).getTime();
		    	
		    	Map<String, String> map = new HashMap<String, String>();

		    	map.put("id", String.valueOf(newsId));
				map.put("title",newsTitle);
				map.put("date",String.valueOf(newsTime));
				
				list.add(map);
		    } 
		    JSONObject jsonResultAll=new JSONObject();
		    JSONObject jsonResult=new JSONObject();
            JSONArray outArray=JSONArray.fromObject(list);
            jsonResult.put("more", outArray);
            jsonResultAll.put("date", jsonResult);
            String jsonStr = jsonResultAll.toString();
            request.setAttribute("json",jsonStr);
		    /*return "readAndMore";*/return "IOSnews";
		}
		return "IOSnews";
	}
}