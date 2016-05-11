package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contract.sql.updateInformation;
import com.javabean.contract.javaBeanZhuce;

/**
 * Servlet implementation class changePerInformation
 */
@WebServlet("/changePerInformation")
public class changePerInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changePerInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("myname");
		 String school=request.getParameter("school");
		 String youbian=request.getParameter("youbian");
		 String tencent=request.getParameter("tencent");
		 String wechat=request.getParameter("wechat");
		 String phoneNumber=request.getParameter("phoneNumber");
		 String username=request.getParameter("username");
		 String sdept=request.getParameter("sdept");
		 String mailbox=request.getParameter("mailbox");
		 
		 
		javaBeanZhuce user=new javaBeanZhuce();
		user.setNmame(name);
		user.setUserName(username);
		user.setMailbox(mailbox);
		user.setPhoneNum(phoneNumber);
		user.setTencent(tencent);
		user.setSchool(school);
		user.setWechat(wechat);
		user.setSdept(sdept);
		user.setYoubian(youbian);
	    updateInformation up=new updateInformation();
	    up.update(user);
	    
	   // response.sendRedirect("userinfor.jsp");
	    
	    response.sendRedirect("/contract89/getPersonInf");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
