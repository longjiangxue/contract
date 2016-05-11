package com.contract.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import com.javabean.contract.javaBeanZhuce;




public class zhuceAction {

    
	public	void insertUser(javaBeanZhuce user){
		   Connection conn=null;
		    Statement stml=null;
		   //ResultSet res=null;
		   String sql=null;
		   sql="INSERT INTO classmate(username,password,school,name,tencent,phoneNumber)  values('"+user.getUserName()+"','"+user.getPassword()+"','"+user.getSchool()+"','"+user.getName()+"','"+user.getTencent()+"','"+user.getPhoneNum()+"') ";
		   try{
				Class.forName("com.mysql.jdbc.Driver");
	   		   	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classcontra?charaterEncoding=utf-8","root","");
	   		     stml= conn.createStatement();
	   		   	stml.executeUpdate(sql);	
	   		   	//stml.executeUpdate(sql);
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
		   finally{
			   databaceManage mange=new databaceManage();
			   mange.closeDb(stml, conn);
		   }
		 
		
	}
	
	public void insertInfor(javaBeanZhuce user){
		
		 Connection conn=null;
		    Statement stml=null;
		   //ResultSet res=null;
		   String sql=null;
		   //sql="update classmate set(name,school,tencent,wechat,youbian,phonenumber)  values('"+user.getName()+"','"+user.getSchool()+"','"+user.getTencent() +"','"+user.getWechat()+"','"+user.getYoubian()+"','"+user.getPhoneNum()+"')";
		   sql=" update classmate set name='"+user.getName()+"',school='"+user.getSchool()+"',tencent='"+user.getTencent()+"',wechat='"+user.getWechat()+"',youbian='"+user.getYoubian()+"',phonenumber='"+user.getPhoneNum()+"'   where username= '"+user.getUserName()+"' ";
		   try{
				Class.forName("com.mysql.jdbc.Driver");
	   		   	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/classcontra?charaterEncoding=utf-8","root","");
	   		     stml= conn.createStatement();
	   		   	stml.executeUpdate(sql);	
	   		   
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
		   finally{
			   databaceManage mange=new databaceManage();
			   mange.closeDb(stml, conn);
		   }
		
	}
	
}
