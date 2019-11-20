<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'editCustom.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    	<script src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/update.js"></script>
    
  </head>
  
  <body>
    
<div class="main">
<div id="top">客户修改</div>
<form action="custom_updateCustom.action?customid=${requestScope.custom.customid}" method="post" >
<h2>客户名称：&nbsp;&nbsp;<input type="text"  class="name" name="cname" value="${requestScope.custom.cname}"/><br>
客户地址：&nbsp;&nbsp;<input type="text" name="caddress" value="${requestScope.custom.caddress}"/><br>
客户邮箱：&nbsp;&nbsp;<input type="text" name="cemail" value="${requestScope.custom.cemail}"/><br>
邮政编码：&nbsp;&nbsp;<input type="text" name="cpost" class="post" value="${requestScope.custom.cpost}"/><br>
</h2>
<input type="submit" value="修改" class="sub">&nbsp;&nbsp;
<input type="reset" value="重置" class="sub">
</form>
</div>

  </body>
</html>
