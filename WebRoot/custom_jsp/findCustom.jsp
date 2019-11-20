<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>用户登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
 <body>
                <div >            
                    <table  width="890" border="1">
                        <tr>
                            <th>客户ID</th>
                            <th >客户名</th>
                            <th>客户地址</th>     
                             <th>邮箱地址</th>  
                             <th>邮政编码</th>    
                             <th>修改</th>
                              <th>删除</th>                          
                        </tr>         
                        <s:iterator value="customLists"  id="customItem" status="st">             
                        <tr>
                            <td>${customItem.customid}</td>
                            <td>${customItem.cname}</td>
                            <td>${customItem.caddress}</td>      
                            <td>${customItem.cemail}</td>      
                            <td>${customItem.cpost}</td>      
                            <td><a href="${pageContext.request.contextPath}/custom_toUpdate.action?customid=${customItem.customid}">修改</a></td>
                            <td><a href="${pageContext.request.contextPath}/custom_delelteCustom.action?customid=${customItem.customid}">删除</a></td>    
                        </tr>
                        </s:iterator>	
                    </table>
                </div>
              
    </body>
</html>