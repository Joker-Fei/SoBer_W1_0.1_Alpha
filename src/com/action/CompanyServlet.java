package com.action;

 
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
 

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.entity.Company;
 
import com.service.CompanyService;

public class CompanyServlet extends HttpServlet {

//	http://localhost:8080/SoBer_W1_0.1_Alpha/companyInfo
	/**
	 * Constructor of the object.
	 */
	public CompanyServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	//������������
	String companyInfo;
  public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String companyInfo(){
	  	
		HttpServletRequest request=ServletActionContext.getRequest();
		
		CompanyService companyService=new CompanyService();
		List<Company> companyList = companyService.findAll();
		
		JSONObject jsonContent=new JSONObject();
		String value=(String)companyList.get(0).getContent();
		jsonContent.put("content", value);//��ǰ�˴��ͼ�ֵ��||�˴���companyList��List<Company>�ļ��ϵ�ʵ����
		
		
		String jsonStr=jsonContent.toString();
		request.setAttribute("json", jsonStr);
		
		return "companyContent";//���ص�Struts.xml�е�action�е�jsonDate.jsp
  }
	public void init() throws ServletException {
	 
	}
	
	/*
	JSONObject jsonResult=new JSONObject();
    JSONArray outArray=JSONArray.fromObject(list);
    jsonResult.put("ordDevice", outArray);
    String jsonStr = jsonResult.toString();
    */

}
