package com.tools;

import java.io.File;

public class GetServerRealPathTools {
	/**
	 * 获取项目在服务其中的真实路径的工具类
	 * 
	 * 这是在web项目中，获取项目实际路径的最佳方式，在windows和linux系统下均可正常使用
	 * 
	 */
public static String getRootPath() {
	
	String classPath = GetServerRealPathTools.class.getClassLoader().getResource("/").getPath();
	System.out.println("classPath---"+classPath);
	String rootPath = "";
	//windows下
	if("\\".equals(File.separator)){
//		System.out.println("windows");
	rootPath = classPath.substring(1,classPath.indexOf("/WEB-INF/classes"));
	rootPath = rootPath.replace("/", "\\");
	}
	//linux下
	if("/".equals(File.separator)){
//		System.out.println("linux");
	rootPath = classPath.substring(0,classPath.indexOf("/WEB-INF/classes"));
	rootPath = rootPath.replace("\\", "/");
	}
	return rootPath;
	}
public static void main(String[] args) {
	
	String url=GetServerRealPathTools.getRootPath();
	System.out.println("url="+url);
	
}
}
