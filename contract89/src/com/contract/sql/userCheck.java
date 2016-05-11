package com.contract.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import com.mysql.jdbc.PreparedStatement;


public class userCheck {
	 public boolean checkUserPass(String myname,String MyPassword){
	   	  Connection con=null;
	   	  PreparedStatement stml=null;
	   	  ResultSet res=null;
	   	  String sql=null;
	   	  boolean result=false;
	   	 sql="select * from classmate  where username='" + myname + "' and password='" + MyPassword + "' ";
	   	   try{
	   		   	Class.forName("com.mysql.jdbc.Driver");
	   		   	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classcontra?charaterEncoding=utf-8","root","");
	   		    stml=(PreparedStatement) con.prepareStatement(sql);	   
	   		    res=stml.executeQuery();
	   		    while(res.next()){
	   		    	
	   		    	 result=true;
	   		    	                    
	   		    }
	   	   }
	   	  catch(Exception e ){
	   		  
	   	  }
	   	  return result;
	     }
	 
	 
	 public boolean checkUseronly(String myname){
		      databaceManage DM=new databaceManage();
		      Connection con=null;
		     PreparedStatement stml=null;    
		     String sql=null;
		     ResultSet res=null;
		     boolean only=true;
		     sql="select username from classmate where username='"+myname+"' ";
		     try{
		      
		         con=DM.dbInit();
		         stml=(PreparedStatement) con.prepareStatement(sql);
		         res=stml.executeQuery();
				   while(res.next()){
					if(myname.equals(res.getString("username"))) {
						only=false;
						break;
					} 
				   }
		        
		     }
		     catch(Exception e){
		    	 e.printStackTrace();
		     }
		     finally{
		    	 DM.closeDb(stml, con, res);
		     }
		     return only;
		 
		   
	 }
	 
	 
	 public String[] checkManagerPass(String myname,String MyPassword){
	   	  Connection con=null;
	   	  PreparedStatement stml=null;
	   	  ResultSet res=null;
	   	  String sql=null;
	      String[] result=new String[2];
	        result[0]="false";
	   	 sql="select school from classManager  where username='" + myname + "' and password='" + MyPassword + "' ";
	   	   try{
	   		   	Class.forName("com.mysql.jdbc.Driver");
	   		   	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classcontra?charaterEncoding=utf-8","root","");
	   		    stml=(PreparedStatement) con.prepareStatement(sql);	   
	   		    res=stml.executeQuery();
	   		    while(res.next()){
	   		        result[0]="true";
	   		    	result[1]=res.getString("school");
	   		    	                    
	   		    }
	   	   }
	   	  catch(Exception e ){
	   		  
	   	  }
	   	  return result;
	     }	 
	 
	
}

