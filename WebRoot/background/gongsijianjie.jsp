<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  <form id="form1" name="comInfo" action="companyInfoServlet?id=1" method="post">
  	<h2>&nbsp&nbsp 某某物流公司</h1>
  	<table align="center" width="80%" border="0">
  		<tr>
  			<td>
  				<h3>公司简介：</h3>
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<!-- <input style="width:100%;height:500px" size="500" type="text" name="content" value=${content}> -->
  				<textarea id="content" name="content" style="width:80%;height:500px;" size="500">${content}</textarea>
  			</td>
  		</tr>
  		<tr>
  			<td>
  				<input type="submit" value="提交" name="Submit">
				<input type="reset" value="还原">
  			</td>
  		</tr>
  	</table>
  	<!-- <input type="button" value="按钮" name="button1" onclick="document.getElementById('form1').submit();"> -->
  	
	</form>

	<%  
        HttpSession sess = request.getSession();  
        String message = (String)sess.getAttribute("Msg");  
    	if(message == null||message == ""){  
    %>  
    <%  
    	}else{  
    %>  
             <script type="text/javascript">  
                    alert("<%=message%>");  
            </script>  
    <%  
        	sess.setAttribute("Msg", "");  
    	}  
 	%>  
  </body>
</html>
