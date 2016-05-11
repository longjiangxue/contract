<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link  rel="stylesheet"  type="text/css"  href="css/css.css"> 

</head>
<body class="userPageBody">

 <% Object username=session.getAttribute("username");   %> 

  <div  class="page">
    	<div class="userfsec">
    	 		<div class="useronef">
    	 		 		<!--   <img alt="校徽" src="image/logo.jpg" width=100%,height:100%> -->
    	 		</div>
    	 		<div class="useronet">
    	 		            <div class="miaoclock" >
    	 				    <a href="/contract89/getPersonInf?username=<%=username %>" target="maincontent">个人信息</a><br><br>
    	 				    <a href="classpicture.jsp" target="maincontent">班级相册</a><br><br>
    	 				    <a href="/contract89/countValueServlet?username=<%=username %>" target="maincontent">班级通讯录</a><br><br>
    	 				    <a href="classmess.jsp" target="maincontent">班级公告</a><br></div><br>
    	 		</div>
    	</div>
    	<div class="usertsec" >
    	        <div  class="usertwof">
    	           		 <div class="welcomemes"> <p>亲爱的<b><%=username %>  </b>，欢迎使用班级通讯录，  </p> </div>
    	        </div>
    			<div  class="usertwot">
    			    <iframe  name="maincontent"  frameborder="0" width=100% height=100%  scrolling="auto"  ></iframe>
    			   
    			  
    			</div>
    	</div>
   
  </div>

</body>
</html>