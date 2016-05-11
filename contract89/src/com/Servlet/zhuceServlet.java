package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.javabean.contract.*;
import com.contract.sql.*;

/**
 * Servlet implementation class zhuceServlet
 */
@WebServlet("/zhuceServlet")
public class zhuceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zhuceServlet() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		zhuceAction zhuce=new zhuceAction(); 
		String zhuceUser=request.getParameter("username");
	      String zhucePassword=request.getParameter("password");
	      String name=request.getParameter("name");
	      String school=request.getParameter("school");
	      String tel=request.getParameter("tel");
	      String tencent=request.getParameter("qq");
	      
	       userCheck check=new userCheck();
	        if( check.checkUseronly(zhuceUser)){
	      javaBeanZhuce user=new javaBeanZhuce();
	      user.setUserName(zhuceUser);
		  user.setPassword(zhucePassword);	
		  user.setNmame(name);
		  user.setSchool(school);
		  user.setPhoneNum(tel);
		  user.setTencent(tencent);
		 
		  zhuce.insertUser(user);
		  
		 request.getSession().setAttribute("zhuceUser", zhuceUser);	 
		  request.getRequestDispatcher("/index.html").forward(request, response);
	        
	       }
	        else{
	        	 request.getRequestDispatcher("/check.jsp").forward(request, response);
	        }
		   
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("ok");
		doGet(request, response);
	}

}
