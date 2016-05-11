package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.contract.sql.zhuceAction;
import com.javabean.contract.javaBeanZhuce;

/**
 * Servlet implementation class personInforServlet
 */
@WebServlet("/personInforServlet")
public class personInforServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public personInforServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    request.setCharacterEncoding("utf-8");
		String myname=request.getParameter("myname");
		 String school=request.getParameter("school");
		 String youbian=request.getParameter("youbian");
		 String tencent=request.getParameter("tencent");
		 String wechat=request.getParameter("wechat");
		 String phoneNumber=request.getParameter("phoneNumber");
		 String username=request.getParameter("username");
	
		
			 
		 javaBeanZhuce user=new javaBeanZhuce();
		user.setNmame(myname);
	    user.setSchool(school);
	    user.setYoubian(youbian);
	    user.setTencent(tencent);
        user.setWechat(wechat);
        user.setPhoneNum(phoneNumber);
        user.setUserName(username);
        zhuceAction infor=new zhuceAction();
        infor.insertInfor(user);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
