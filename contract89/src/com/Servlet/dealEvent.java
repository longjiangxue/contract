package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contract.sql.userCheck;

/**
 * Servlet implementation class dealEvent
 */
@WebServlet("/dealEvent")
public class dealEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public dealEvent() {
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
	  String password=request.getParameter("p");
	    userCheck judege=new userCheck();
	    if(judege.checkUserPass(username,password)==true){
	    	
	    	request.getSession().setAttribute("username", username);
	    	response.sendRedirect("userpage.jsp");
	    
	    }
	    else{
	    	response.sendError(404, "你的账号或密码错误");
	    	
	    }
	  
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
