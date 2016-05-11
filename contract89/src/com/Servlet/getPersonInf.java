package com.Servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.contract.sql.getPerson;

/**
 * Servlet implementation class getPersonInf
 */
@WebServlet("/getPersonInf")
public class getPersonInf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPersonInf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  getPerson getP=new getPerson();
		   String school=null;
		   String result[]=new String[9];
		   String name=null;
		   String tencent=null;
		   String wechat=null;
		   String youbian=null;
		   String phonenumber=null;
		   String mailbox=null;
		   String sdept=null;
		   String username=(String) request.getSession().getAttribute("username");
		 result= getP.getPersonInfor(username);
		 name=result[1];
		 school=result[0];
		 tencent=result[2];
		 wechat=result[3];
		 youbian=result[4];
		 phonenumber=result[5];
		 mailbox=result[6];
		 sdept=result[7];
		 //User user= new User();  //传值用bean 来传参数
		 //user.setFullName("dd00");
		 //request.getSession().setAttribute("user",user );
		 
		  request.getSession().setAttribute("school",school );
		  request.getSession().setAttribute("name",name );
		  request.getSession().setAttribute("tencent",tencent );
		  request.getSession().setAttribute("wechat",wechat ); 
		  request.getSession().setAttribute("youbian",youbian );
		  request.getSession().setAttribute("phonenumber",phonenumber );
		  request.getSession().setAttribute("mailbox",mailbox );
		  request.getSession().setAttribute( "sdept",sdept);
		  
		  request.getRequestDispatcher("/userinfor.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
