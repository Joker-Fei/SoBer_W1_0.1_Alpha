package com.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.entity.Company;
import com.entity.Discount;
import com.entity.News;
import com.service.CompanyService;
import com.service.DiscountService;
import com.service.NewsService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class IOSmain_news extends HttpServlet {

	public IOSmain_news() {
		super();
	}
	
	public String mainNews;
	 
	public String getMainNews() {
		return mainNews;
	}

	public void setMainNews(String mainNews) {
		this.mainNews = mainNews;
	}
	
	//http://localhost:8080/SoBer_W1_0.1_Alpha/IOSmain_news 
	public String mainNews(){
		/*数组转换成json代码
		boolean[] boolArray = new boolean[] { true, false, true };
		JSONArray jsonArray1 = JSONArray.fromObject(boolArray);*/
		
		/*List集合转换成json代码+
		List list = new ArrayList();
		list.add( "first" );
		list.add( "second" );
		JSONArray jsonArray2 = JSONArray.fromObject( list );*/
		//公司简介
		HttpServletRequest request=ServletActionContext.getRequest();
		CompanyService companyService=new CompanyService();
		List<Company> companyList = companyService.findAll();
		String value=(String)companyList.get(0).getContent();//获取String类型的content
		String aa=value.replaceAll("<p>", " ");		
		value=aa.substring(0, 120)+"...";
		JSONObject jsonMainAll=new JSONObject();
		JSONObject jsonMain=new JSONObject();
		JSONObject jsonContent=new JSONObject();
	    jsonContent.put("content", value); 
	    jsonMain.put("companyInfo",jsonContent);
	 	//公司新闻
		NewsService newsService=new NewsService();
		List<News> newsList=newsService.findAll();
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		   for(News i:newsList){
	    	int newsId=(int)i.getId();
	    	String newsTitle=i.getTitle();
	    	Date newsTime=i.getTime();
	    	Map<String, String> map = new HashMap<String, String>();
	    	map.put("id", String.valueOf(newsId));
			map.put("title",newsTitle);
			map.put("date",String.valueOf(newsTime));
	    
			list.add(map);//将数据循环放入List集合中
	    }
	    
		JSONArray outArray2=JSONArray.fromObject(list);
		
		jsonMain.put("news",outArray2);
		
		//公司优惠信息展示
		DiscountService discountService=new DiscountService();
		List<Discount> discountList=discountService.findAll();
		
		List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
		
	    for(Discount i:discountList){
	    	int discountId=(int)i.getId();
	    	String discountTitle=i.getTitle();
	    	Date discountTime=i.getTime();
	    	
	    	Map<String, String> map = new HashMap<String, String>();

	    	map.put("id", String.valueOf(discountId));
			map.put("title",discountTitle);
			map.put("date",String.valueOf(discountTime));
	    
			list2.add(map);//将数据循环放入List集合中
	    }
		JSONArray outArray3=JSONArray.fromObject(list2);
		jsonMain.put("discount",outArray3);
		jsonMainAll.put("date", jsonMain);
		
		String jsonStr2=jsonMainAll.toString();
		request.setAttribute("json", jsonStr2); 

		return "IOSmainNews";
	} 
}
