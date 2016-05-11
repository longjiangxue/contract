package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contract.sql.countValue;
import com.contract.sql.getPerson;
import com.sun.media.sound.RealTimeSequencerProvider;

/**
 * Servlet implementation class countValueServlet
 */
@WebServlet("/countValueServlet")
public class countValueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public countValueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  String  rowCount=null;
		  String[] resultList=null;
		  String school=null;
		  countValue count=  new countValue();
		  String username=request.getParameter("username");
		  

		  getPerson getSchool=new getPerson();
		  resultList=getSchool.getPersonInfor(username);		   
		  school=resultList[0];
		  
		  rowCount=count.getCount(school); //这里参数应该来自jsp000
		  request.setAttribute("rowCount", rowCount);
		  request.setAttribute("school", school);    
		  request.setAttribute("pageNow", "1");
		  request.setAttribute("qufen", "judge");
		
		 //request.getSession().setAttribute("rowCount", rowCount);
		  //request.getSession().setAttribute("school", school);
		  //request.getSession().setAttribute("pageNow", "1");
		 // request.getSession().setAttribute("qufen", "1");
		  //request.getAttribute("rowCount");
		  
		  //response.sendRedirect("classcontract.jsp");
		// response.sendRedirect("/contract89/fenyeServlet");
		  request.getRequestDispatcher("/fenyeServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
