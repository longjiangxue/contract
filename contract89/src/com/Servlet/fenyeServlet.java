package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contract.sql.countValue;

/**
 * Servlet implementation class fenyeServlet
 */
@WebServlet("/fenyeServlet")
public class fenyeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fenyeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		 request.setCharacterEncoding("utf-8");
		 String valueList[][]=new String[100][];
		 String judge="";
		 judge=(String)request.getAttribute("qufen");
		 String row="";
		 String school="";
		 String pageNow="";
		 String flag="true";
		 
		   if( "judge".equals(judge)){
			    school=(String) request.getAttribute("school");
			    pageNow=(String) request.getAttribute("pageNow");
			   row=(String) request.getAttribute("rowCount");
			   flag="true";
		   }else{
			   
			    pageNow=request.getParameter("pageNow");
				 school=request.getParameter("school");	 
				 row=request.getParameter("rowCount");
				 flag="false";
	           }
		 
		   int rowCount=Integer.parseInt(row); 
		  int pageSize=3;
		  int pageCount=0;
		  String result=null;
		  pageCount=(rowCount-1)/pageSize+1;//页面
		  countValue  aa=new countValue();
		  
		  valueList=aa.getPageCount(rowCount,Integer.parseInt(pageNow), pageSize,school );
		  /*是否集合， 可以直接把这些纸值传到JSP， 而不用这么麻烦*/
		   request.setAttribute("valueList[0][0]", valueList[0][0]);
		   request.setAttribute("valueList[0][1]", valueList[0][1]);
		   request.setAttribute("valueList[0][2]", valueList[0][2]);
		   request.setAttribute("valueList[0][3]", valueList[0][3]);
		   request.setAttribute("valueList[0][4]", valueList[0][4]);
		   request.setAttribute("valueList[0][5]", valueList[0][5]);
		   request.setAttribute("valueList[0][6]", valueList[0][6]);
		   request.setAttribute("valueList[0][7]", valueList[0][7]);
		   request.setAttribute("valueList[0][8]", valueList[0][8]);
		   
		   request.setAttribute("valueList[1][0]", valueList[1][0]);
		   request.setAttribute("valueList[1][1]", valueList[1][1]);
		   request.setAttribute("valueList[1][2]", valueList[1][2]);
		   request.setAttribute("valueList[1][3]", valueList[1][3]);
		   request.setAttribute("valueList[1][4]", valueList[1][4]);
		   request.setAttribute("valueList[1][5]", valueList[1][5]);
		   request.setAttribute("valueList[1][6]", valueList[1][6]);
		   request.setAttribute("valueList[1][7]", valueList[1][7]);
		   request.setAttribute("valueList[1][8]", valueList[1][8]);
		   
		   request.setAttribute("valueList[2][0]", valueList[2][0]);
		   request.setAttribute("valueList[2][1]", valueList[2][1]);
		   request.setAttribute("valueList[2][2]", valueList[2][2]);
		   request.setAttribute("valueList[2][3]", valueList[2][3]);
		   request.setAttribute("valueList[2][4]", valueList[2][4]);
		   request.setAttribute("valueList[2][5]", valueList[2][5]);
		   request.setAttribute("valueList[2][6]", valueList[2][6]);
		   request.setAttribute("valueList[2][7]", valueList[2][7]);
		   request.setAttribute("valueList[2][8]", valueList[2][8]);

		   request.setAttribute("flag", flag);
		   request.setAttribute("rowCount", row);
		 /* response.sendRedirect("classcontract.jsp");*/
		   request.getRequestDispatcher("classcontract.jsp").forward(request, response);;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
