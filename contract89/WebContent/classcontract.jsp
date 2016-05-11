<%@page import="com.tool.changeChartSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/css.css" >
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<%-- <% String row= (String)session.getAttribute("rowCount");
   String school=(String)session.getAttribute("school");
    int  pageSize=3;// 一个页面的记录数
    int  rowCount=Integer.parseInt(row);  
    int  pageCount=(rowCount-1)/pageSize+1; //要分成多少页
     int j=1; 
%> --%>

<%
    String flag=(String)request.getAttribute("flag");
    String row=""; 
    String school="";
    int  pageSize=3;// 一个页面的记录数
    int  rowCount=0;
    
  if(flag.equals("true")){
	   row= (String)request.getAttribute("rowCount");
	   school=(String)request.getAttribute("school");  
	    rowCount=Integer.parseInt(row);  
  }
  else{
	    //row=(String)session.getAttribute("rowCount");  
	    school=(String)session.getAttribute("school");
	    row= (String)request.getAttribute("rowCount");
	    rowCount=Integer.parseInt(row);
	    
  }

    int  pageCount=(rowCount-1)/pageSize+1; //要分成多少页
     int j=1; 
%>


  
  
<p>班级通讯录信息测试</p>

  <table border="1"  >
       <tr>
         <th>姓名  </th>
         <th>邮编  </th>
         <th>QQ号</th>
         <th>微信号</th>
         <th>手机号</th>
         <th>学校</th>
         <th>专业</th>
         <th>邮箱</th>
         <th>班级</th>
       </tr>
        
         <tr>
      <th><%=request.getAttribute("valueList[0][0]")%></th>
         <th><%=request.getAttribute("valueList[0][1]")%></th>
         <th><%=request.getAttribute("valueList[0][2]")%></th>
         <th><%=request.getAttribute("valueList[0][3]")%></th>
         <th><%=request.getAttribute("valueList[0][4]")%></th>
         <th><%=request.getAttribute("valueList[0][5]")%></th>
         <th><%=request.getAttribute("valueList[0][6]")%></th>
         <th><%=request.getAttribute("valueList[0][7]")%></th>
         <th><%=request.getAttribute("valueList[0][8]")%></th> 
       </tr>  
        <tr>
         <th><%=request.getAttribute("valueList[1][0]")%></th>
         <th><%=request.getAttribute("valueList[1][1]")%> </th>
         <th><%=request.getAttribute("valueList[1][2]")%></th>
         <th><%=request.getAttribute("valueList[1][3]")%></th>
         <th><%=request.getAttribute("valueList[1][4]")%></th>
         <th><%=request.getAttribute("valueList[1][5]")%></th>
         <th><%=request.getAttribute("valueList[1][6]")%></th>
         <th><%=request.getAttribute("valueList[1][7]")%></th>
         <th><%=request.getAttribute("valueList[1][8]")%></th>
       </tr>  
        <tr>
         <th><%=request.getAttribute("valueList[2][0]")%></th>
         <th><%=request.getAttribute("valueList[2][1]")%></th>
         <th><%=request.getAttribute("valueList[2][2]")%></th>
         <th><%=request.getAttribute("valueList[2][3]")%></th>
         <th><%=request.getAttribute("valueList[2][4]")%></th>
         <th><%=request.getAttribute("valueList[2][5]")%></th>
         <th><%=request.getAttribute("valueList[2][6]")%></th>
         <th><%=request.getAttribute("valueList[2][7]")%></th>
         <th><%=request.getAttribute("valueList[2][8]")%></th>
       </tr>  			   
        	
        
        
  </table>
  <br>
<div >
<% changeChartSet aa=new changeChartSet();%>
 

<a href="/contract89/fenyeServlet?pageNow=<%=(int)1 %>&&rowCount=<%=rowCount %>&&school=<%=school %>" >首页</a>

 <%
  
   for(j=1;j<pageCount+1;j++){
	 %>
	   
	   <a href="/contract89/fenyeServlet?pageNow=<%=j%>&&rowCount=<%=rowCount %>&&school=<%=school%>"> <%=j %> </a>
	<%   
   }
%>
<a href="/contract89/fenyeServlet?pageNow=<%=j-1%>&&rowCount=<%=rowCount%>&&school=<%=school%>">尾页</a>
</div>
</body>
</html>



