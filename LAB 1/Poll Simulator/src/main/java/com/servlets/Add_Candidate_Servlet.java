package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.Candidate_bean;
import com.dao.Candidate_dao;

/**
 * Servlet implementation class Add_Candidate_Servlet
 */
@WebServlet("/Add_Candidate_Servlet")
public class Add_Candidate_Servlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("can_name");
		
		Candidate_bean cb= new Candidate_bean();
		cb.setCandidate_name(name);
		
			if(Candidate_dao.save(cb))
			{
				out.print("<p>Record saved successfully!</p>");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}
			else
			{
				out.println("Sorry! unable to save record");
			}	
		}

}
