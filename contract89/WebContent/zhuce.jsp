 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validate()
{
	
var fname=document.getElementById("fname").value
var one=document.getElementById("one").value
var two=document.getElementById("two").value
var fbox=document.getElementById("fMailbox").value;
var patter=new RegExp("@");


submitOK="true"

 if(fname == "" ){
	 alert("用户名不能为空");
	 submitOK="false"
 }
 else if(fname.length<5){
	 alert("用户名不能小于5个字符")
	 submitOK="false";
 }

 if(two== ""||one==""){
	 alert("密码不能为空");
	 submitOK="false";
 }
if (one!=two)
 {
 alert("两次输入密码必须相等")
 submitOK="false"
 }
 if(fbox==""){
	 alert("邮箱不能为空");
	 submitOK="false";
 }
 else if(!patter.test(fbox)){
	 alert("不是合法的邮箱地址");
	 submitOK="false";
 }

if (submitOK=="false")
 {
 return false
 }
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body  style="text-align: center;">
     <div class="zhucepage" >
      
        <h2>欢迎<b>注册</b>班级通讯录，：</h2><br>
           <p><strong>在这里，你可以联系到曾经的同窗好友，让青春在这里重新燃烧</strong> </p><br>
           <b><a href="index.jsp">我已经有账号了，试着点击这里</a></b><br> <br>
        <div>
        
                   
             <form name="form"   action="/contract89/zhuceServlet"  method="post" onsubmit="return validate()" >
               		<div><b>用户名:</b><input id="fname" type="text" name="zhuceuser"></div><br>
               		<div><b>密    码:</b><input id="one" type="password" name="zhucepasswordone"></div><br>
               		<div><b>密    码:</b><input id="two" type="password" name="zhucepasswordtwo"></div><br> 
               		<div><b>邮    箱:</b><input  id="fMailbox"   type="text" name="mailbox"> </div><br>
               		<div>  <input  type="submit" value="继续完善资料"   >  </div>     
             </form>
        
        </div>
     
     </div>
</body>
</html> 






