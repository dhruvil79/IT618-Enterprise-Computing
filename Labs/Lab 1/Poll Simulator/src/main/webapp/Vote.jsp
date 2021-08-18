<%@page import="java.util.List"%>
<%@page import="com.dao.Candidate_dao"%>
<%@page import="com.bean.Candidate_bean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Voting_Servlet" method="post">
			<center><p style="font-size:70px;">Vote Here</p>
			<label style="font-size:20px;">Enter ID For Voting :</label>
			<input type="number" name="vote_id" placeholder="Enter ID">
			
	<%
	Candidate_bean td=new Candidate_bean();
	List<String> list=Candidate_dao.getAllCandidateList();
	out.print("<table border='1' width='10%' 'margin-top=0px'");
	out.print("<tr><th>Name</th></tr>");
	
	for(String e:list)
	{
		%>
		<tbody>
    <tr>
    
    <td><input type="radio" name="vote" value="<% out.println(e); %>"><% out.println(e); %> </td>
    </tr>		  	
               <%
              		}
              %>
     <input type="submit" value="submit">
     </form>
     
</body>
</html>