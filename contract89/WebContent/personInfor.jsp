<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link  rel="stylesheet"  type="text/css"  href="css/css.css"> 
</head>
<body style="text-align: center;">

<% request.setCharacterEncoding("utf-8"); %>

	  <div>  
	       <h2>请完善以你的信息，以有更好的体验。</h2>
	      
	        <form action="/contract89/personInforServlet" method="post">
	       <div class="personInforSty"><strong  >姓名:</strong><input type="text" name="myname"></div>
	       <div class="personInforSty"><strong >学校：</strong><input type="text" name="school"></div>
	       <div class="personInforSty"><strong   >邮编:</strong><input  type="text" name="youbian"></div>
	       <div class="personInforSty"><strong   >QQ号:</strong><input type="text" name="tencent"></div>
	       <div class="personInforSty"><strong  >微信号:</strong><input type="text" name="wechat"></div>
	       <div class="personInforSty"><strong  >手机号:</strong><input  type="text" name="phoneNumber"> </div>
	       <div>  <input type="hidden" name="username"  value="<%= session.getAttribute("zhuceUser") %>" ></div> 
	       <div class="personInforSty">  <input  type="submit"  value="完成"></div>
	       </form> 
	       
	       
	      <!--  <from>
	        <table  class="personInforSty">
	            <tr> 
	            	<th>姓名：</th>
	            	<th><input type="text" name="myname"></th>
	            </tr>
	            	 <th>学校：</th>
	             	<th><input type="text" name="school"></th>
                <tr>
                	 <th>邮编:</th>
                	  <th><input type="text" name"youbian"></th>
                </tr>
                <tr>
                	 <th>QQ号:</th>
                	  <th><input type="text" name="tencent"></th>
                </tr>
                <tr>
                       <th>微信号:</th>
                        <th><input type="text" name="wechat"></th>
                </tr>
                <tr>
                       <th>手机号：</th>
                        <th><input type="text" name="phoneNumber"></th>
                </tr>
                <tr> 
                	  <th></th> 
                 	  <th></th>
                </tr>
	        
	        </table>
	          <input type="submit" value="完成">
	        </from> -->
	      
	      
	  </div>





</body>
</html>