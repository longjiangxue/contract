package com.contract.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class countValue {
	
	  public String getCount(String school){
		  
		   Connection con=null;
		   PreparedStatement stml=null;
		   ResultSet res=null;
		   String sql=null;
		   String result=null;
		   sql="select count(username)  from classmate where school='"+school+"'";
		 try {
		     databaceManage DBint=new databaceManage();
		     con=DBint.dbInit();
			 stml=(PreparedStatement) con.prepareStatement(sql);
			 res=stml.executeQuery();
			 while(res.next()){
				 String res1=res.getString(1);
				result=res1;
			 }
			 DBint.closeDb(stml, con, res);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return result;
		  
	  }
	  
	  public String[][] getPageCount(int rowCount,int pageCount,int pageSize,String school){
		    Connection con=null;
		    PreparedStatement stml=null;
		    ResultSet  res=null;
		    String sql=null;
		    String result=null;
		    Integer start=new Integer(pageSize*(pageCount-1));
		   String value=start.toString();
		   Integer page=new Integer(pageSize);
		   String value1=page.toString(); 
		  String valueList[][]=new String[100][20]; //这里的数组应该是活动的
		   
		    sql= "select * from classmate where school='"+school+"' limit "+value+","+ value1;
		    try{
		    	 databaceManage DBint=new databaceManage();
			     con=DBint.dbInit();
			     stml=(PreparedStatement) con.prepareStatement(sql);
			     res=stml.executeQuery();
			     int i=0,j=0;
			     while(res.next()){
					 String res1=res.getString("name");
					 String res2=res.getString("youbian");
					 String res3=res.getString("tencent");
					 String res4=res.getString("wechat");
					 String res5=res.getString("phoneNumber");
					 String res6=res.getString("school");
					 String res7=res.getString("stept");
					 String res8=res.getString("mbox");
					 String res9=res.getString("class");
					 j=0;
					 valueList[i][j++]=res1;
					 valueList[i][j++]=res2;
					 valueList[i][j++]=res3;
					 valueList[i][j++]=res4;
					 valueList[i][j++]=res5;
					 valueList[i][j++]=res6;
					 valueList[i][j++]=res7;
					 valueList[i][j++]=res8;
					 valueList[i][j++]=res9;
					 
					 i++;
					
				 }
			     
			     
		    }
		    catch(Exception e){
		    	e.printStackTrace();
		    }
		   
		  return valueList;
		  
	  }
	

}
