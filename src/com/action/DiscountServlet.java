package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.entity.Discount;
import com.service.DiscountService;
import com.service.DiscountService;

public class DiscountServlet extends HttpServlet {
 
	public DiscountServlet() {
		super();
	}
  
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}
  
	public void init() throws ServletException {
		// Put your code here
	}

	//��˾�Ż���Ϣ
	String discount;
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String discount(){
		 
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String requestStr = request.getParameter("Msg1");
		//System.out.println(requestStr);
		if(requestStr.equals("read")){//��������ǰ�˵�read��id����ǰ�˴�����ϸ��Ϣ����:id,title,content
			
			String id = request.getParameter("Msg2");//����ǰ�˵��û�����ľ����������Ϣ��id
		 
			DiscountService discountService=new DiscountService();
			Discount discount=discountService.findById(id);
			
			int discountId=discount.getId();
			String discountTitle=discount.getTitle();
			String discountContent=discount.getContent();
			Date discountTime=discount.getTime();
			 
			JSONObject jsonResult=new JSONObject();
			
			 jsonResult.put("id", discountId);
			 jsonResult.put("title", discountTitle);
			 jsonResult.put("content",discountContent);
			 jsonResult.put("time",discountTime);
		 
			 String jsonStr = jsonResult.toString();
			 request.setAttribute("json", jsonStr);
			 
			 return "discount";
			
		}else if(requestStr.equals("more")){//��������ࡱ���˴���������ǰ�� ��moreȻ����ǰ�˷���id��title�������ַ���
			
			DiscountService discountService=new DiscountService();
			List<Discount> discountList=discountService.findAll();
			
			List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		     
		    for(int i=0;i<discountList.size();i++){
		    	int discountId=(int)discountList.get(i).getId();
		    	String discountTitle=discountList.get(i).getTitle();
		    	
		    	Map<String, Object> map = new HashMap<String, Object>();

		    	map.put("id", discountId);
				map.put("title",discountTitle);
				
				list.add(map);
		    } 
		    JSONObject jsonResult=new JSONObject();
            JSONArray outArray=JSONArray.fromObject(list);
            jsonResult.put("more", outArray);
            String jsonStr = jsonResult.toString();
            request.setAttribute("json",jsonStr);
		    return "discount";
		}
		
		
		return "discount";
	 
	}
}
