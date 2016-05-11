package com.contract.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class databaceManage {
	
	 
	  public  Connection dbInit(){
		  Connection con=null;
		 
		  
		  try{ 
		  Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classcontra?charaterEncoding=utf-8","root","");
		  
		  
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
		  
		   return con;
		  
	  }
	  public void closeDb( Statement sta,Connection con){
		    
		    try{
		    	 sta.close();
		    	 con.close();
		    }
		    catch(Exception e){}
		  
	  }
	  public void closeDb(Statement sta,Connection con,ResultSet res){
		  try{
			  res.close();
			  sta.close();
			  con.close();
			  
		  }
		  catch(Exception e){
			  
		  }
	  }
	  

}
