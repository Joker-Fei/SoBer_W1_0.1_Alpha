<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gongsijieshao.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <style type="text/css">
	.linear{ 
		width:100%; 
		height:100%; 
		FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0,startColorStr=#b8c4cb,endColorStr=red); /*IE 6 7 8*/ 
		background: -ms-linear-gradient(top,#00FFFF,#fff);        /* IE 10 */
		background:-moz-linear-gradient(top,#ffffff,#00FFFF);/*火狐*/ 
		background:-webkit-gradient(linear, 0% 0%, 0% 100%,from(#ffffff), to(#00FFFF));/*谷歌*/ 
	} 	
  </style>
  <body class="linear">
    This is my JSP page. <br>
  </body>
</html>
