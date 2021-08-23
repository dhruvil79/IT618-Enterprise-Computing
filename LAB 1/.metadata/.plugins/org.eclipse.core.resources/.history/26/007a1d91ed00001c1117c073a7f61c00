package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Candidate_bean;
import com.bean.Voter_bean;
import com.dao.Candidate_dao;
import com.dao.Voter_dao;

/**
 * Servlet implementation class Voting_Summary_Servlet
 */
@WebServlet("/Voting_Servlet")
public class Voting_Servlet extends HttpServlet {	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int vote_no=Integer.parseInt(request.getParameter("vote_id"));
		String name=request.getParameter("vote");
		System.out.println(name);
		
		Voter_bean vb= new Voter_bean();
		vb.setVoter_Number(vote_no);
		Voter_dao vd= new Voter_dao();
			if(vd.Voter_Id(vb))
			{
				Voter_dao.Vote_Count(name);
				Voter_dao.High_Vote_Candidate();
				out.print("<p>Vote saved successfully!</p>");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}
			else
			{
				out.println("Sorry! unable to save your vote because you already voted!!");
				request.getRequestDispatcher("index.jsp").include(request, response);
			}
			
			
		}

}
