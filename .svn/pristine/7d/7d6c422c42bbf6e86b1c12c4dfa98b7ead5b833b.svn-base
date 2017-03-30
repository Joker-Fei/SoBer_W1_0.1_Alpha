<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mainleft.jsp' starting page</title>
    
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
		background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ffffff), to(#00FFFF));      /* Safari 4-5, Chrome 1-9*/
		background: -webkit-linear-gradient(top, #ffffff, #00FFFF);   /*Safari5.1 Chrome 10+*/
		background: -o-linear-gradient(top, #ffffff, #00FFFF);  /*Opera 11.10+*/
	} 
	.tmeau {
		background: -ms-linear-gradient(top,#00FFFF,#DDA0DD);        /* IE 10 *//*设置元素的背景为红色*/
		margin:0px -5px;/* 元素之间的距离 */
		line-height:28px;/*设置行距为28px，让文字在每行的中间位置*/
		color:#F0FFF0 ;/*文字颜色是白色*/
		/*text-align:center;/*让文本居中*/
		font-size:20px;/*号字*/
		font-family:华文行楷,楷体;
		list-style-type:none;
	}
	.meau ul{
		margin:0px -45px;/* 元素之间的距离 */
	}
	.meau ul li{
		list-style-type:none;
	}
	.meau ul li a{
		width:200px;/*设置元素宽为80px*/
		height:40px;/*设置高度为28px*/
		line-height:40px;/*设置行距为28px，让文字在每行的中间位置*/
		background: -ms-linear-gradient(top,#DDA0DD,#00FFFF);        /* IE 10 *//*设置元素的背景为红色*/
		color:#483D8B;/*文字颜色是白色*/
		font-size:30px;/*号字*/
		font-family:华文行楷,楷体;
		display:block;/*这个比较关键，因为a本身就是联级元素，本身不具有宽高，用这个把它变成块级元素，这样前面设置的宽和高就能起作用了*/
		text-align:center;/*让文本居中*/
		text-decoration:none; /*去掉下划线*/
		margin:0px 0px;/* 元素之间的距离 */
	}
	.meau ul li a:hover{ /*这个大概的意思就是当鼠标放到这个a元素的上面时，这个a元素的样式就按下面的代码执行*/
		color:#FF0;/*文字颜色是白色*/
		font-size:31px;/*号字*/
	}
	
  </style>
  <body class="linear">
   
  	<li class="tmeau">主菜单  <%  
        HttpSession sess = request.getSession();  
        String username = (String)sess.getAttribute("UserName");  
    	if(username == null||username == ""){  
    %>  
     		<script type="text/javascript">  
                    alert("有问题！异常登录！");  
            </script>  
    <%  
    	}else{  
    %>  
    	&nbsp&nbsp&nbsp&nbsp ${UserName}
    <%  
    	}  
 	%>  </li>
    <div class ="meau">
    	<ul>
   			<li><a href="companyInfoServlet" target="rightFrame">公司简介</a></li>
   			<li><a href="<%=basePath%>/background/gongsixinwen.jsp" target="rightFrame" >公司新闻</a></li>
   			<li><a href="<%=basePath%>/background/yonghuguanli.jsp" target="rightFrame" >用户管理</a></li>
   			<li><a href="<%=basePath%>/background/xitongxiaoxi.jsp" target="rightFrame" >系统消息</a></li>
   			<li><a href="<%=basePath%>/background/youhuixinxi.jsp" target="rightFrame" >优惠信息</a></li>
   			<li><a href="#" target="rightFrame">other</a></li>
		</ul>
    </div>
  </body>
</html>
