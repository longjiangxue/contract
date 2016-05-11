package com.contract.sql;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;



public class getPerson {
	
	public  String[] getPersonInfor(String myname){
		 Connection con=null;
		 PreparedStatement stml=null;
		 ResultSet res=null;
		 String sql=null;
		 String result[] = new String[9];
		 
		 sql="select * from classmate where username='"+myname+"' ";
		  try{
			  databaceManage DM=new databaceManage();
			  con=DM.dbInit();
			  stml=(PreparedStatement) con.prepareStatement(sql);
			  res=stml.executeQuery();
              while(res.next()){
            	 result[0]= res.getString("school");
            	 result[1]=res.getString("name");
            	 result[2]=res.getString("tencent");
            	 result[3]=res.getString("wechat");
            	 result[4]=res.getString("youbian");
            	 result[5]=res.getString("phonenumber");
            	 result[6]=res.getString("mbox");
            	 result[7]=res.getString("stept");
              }
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
		  return result ;
		 
		 
	 }

}
