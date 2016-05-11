package com.contract.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.javabean.contract.javaBeanZhuce;

public class updateInformation {
	
	
	public	void update(javaBeanZhuce user){
		   Connection conn=null;
		    Statement stml=null;
		   //ResultSet res=null;
		   String sql=null; 
		   sql="update  classmate set name='"+user.getName()+"',school='"+user.getSchool()+"',youbian='"+user.getYoubian()+"',tencent='"+user.getTencent()+"',wechat='"+user.getWechat()+"',phoneNumber='"+user.getPhoneNum()+"',stept='"+user.getSdept()+"',mbox='"+user.getMailbox()+"'  where  username='"+user.getUserName()+"'  ";
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
	
	
}
