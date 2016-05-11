package com.tool;

public class changeChartSet {

	public static String  getNewString(String str){
		String NewString="";
		try{
			
			NewString=new String(str.getBytes("iso-8859-1"),"utf-8");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return NewString;
	}
	
}
