<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table>
    	<tr>
    		<th>��֤��</th>
    		<th><input type="text" name=""/></th>
    	</tr>
    	<tr>
    		<th>�������룺</th>
    		<th><input type="text" name=""/></th>
    	</tr>
    	<tr>
    		<th>�ٴ��������룺</th>
    		<th><input type="text" name=""/></th>
    	</tr>
    	<tr>
    		<th>������</th>
    		<th<input type="text" name="name"/>></th>
    	</tr>
    	<tr>
    		<th>���֤�ţ�</th>
    		<th><input type="text" name=""/></th>
    	</tr>
    	<tr>
    		<form action="register2!register2" method="post" enctype="multipart/form-data">
    		<!-- <th>�ϴ���ʻ֤��Ƭ��</th>
    		<th></th> -->
			<!-- <th>�������룺</th>
			<th><input type="text" name="orderId" /></th> -->
			 
			<th>ѡ���ļ���</th>
			<th><input type="file" name="img" /></th>
			 
			<th><input type="submit" value="�ϴ�" /></th>
		 
    		</form>
    	</tr>
    </table>
  </body>
</html>
