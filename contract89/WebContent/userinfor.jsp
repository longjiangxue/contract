<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link  rel="stylesheet"  type="text/css"  href="css/css.css"> 
<link  rel="stylesheet"  type="text/css"  href="css/buttons.css">
</head>
<body>
<p>用户个人信息测试</p>
<% Object username=session.getAttribute("username"); %>  <!-- 从JSP页面拿到传的值 -->
<% session.setAttribute("username", username); %><!--  传值到servlet用来显示登陆用户的信息 -->
<% Object  school= session.getAttribute("school"); %>
<%  Object name= session.getAttribute("name"); %>
<% Object tencent= session.getAttribute("tencent"); %>
<% Object wechat= session.getAttribute("wechat"); %>
<% Object youbian= session.getAttribute("youbian"); %>
<% Object phonenumber= session.getAttribute("phonenumber"); %>
<% Object mailbox=session.getAttribute("mailbox"); %>
<% Object  sdept=session.getAttribute("sdept"); %>


 <!-- <a href="personInfor.jsp?username" >完善你的信息</a> -->

 <%--  <table border="1">
     <tr>
        <th>姓名:</th>
        <th><%=name %></th>
     </tr>
     
     <tr>
        <th>学校：</th>
        <th><%=school %></th>
     </tr>
     <tr>
     <th>QQ号：</th>
     <th><%=tencent %></th>
     </tr>
     
     <tr>
        <th>微信号：</th>
        <th><%= wechat %></th>
     </tr>
     <tr>
        <th>邮编：</th>
        <th><%= youbian %></th>
     </tr>
     <tr>
        <th>手机号：</th>
        <th><%=phonenumber %></th>
     </tr>
  </table> --%>

   <form  action="/contract89/changePerInformation" method="post"  class="form">
     <div><b class="b">姓名:</b> <input class="inputLocation" type="text" name="myname" value="<%=name %>"> </div><br><br>
     <div><b class="b">学校：</b><input class="inputLocation" type="text" name="school" value="<%=school %>"> </div><br><br>
    <div><b  class="b">专业：</b> <input  class="inputLocation" type="text" name="sdept" value="<%= sdept%>"> </div><br><br>
    <div><b class="b">QQ号：</b><input class="inputLocation" type="text" name="tencent" value="<%=tencent %>"> </div><br><br>
    <div><b class="b">邮箱：</b><input class="inputLocation" type="text" name="mailbox" value="<%=mailbox %>"> </div><br><br>
    <div><b class="b">微信：</b> <input class="inputLocation" type="text" name="wechat" value="<%= wechat%>"> </div><br><br>
    <div><b class="b">手机号：</b> <input class="inputLocation" type="text" name="phoneNumber" value="<%=phonenumber %>"> </div><br><br>         
    <div><b class="b">邮编：</b> <input class="inputLocation" type="text" name="youbian" value="<%= youbian%>"> </div><br><br>
    <div> <input   type="hidden" name="username" value="<%=username %>" ></div><br><br>
    <input class="formSub button button-glow button-rounded button-raised button-primary" type="submit"  value="保存更改信息"> 
   </form>
     <br>
     <br>
				<%-- <form action="/contract89/getPersonInf">
 				 <input type="submit"  value="查看我的信息">
					 <b><%=username %> </b>
			   </form> --%>




</body>
</html>