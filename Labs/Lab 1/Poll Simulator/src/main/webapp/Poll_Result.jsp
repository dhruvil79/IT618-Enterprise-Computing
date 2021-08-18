<%@page import="java.util.Map"%>
<%@page import="com.dao.Voter_dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<center><p style="font-size:70px;">Vote Result</p>
			
	<% 
		out.print("<table border='1' width='20%'");
		out.print("<tr><th>Vote Result</th></tr>");
		
	 
		//for(String key:Candidate_dao.mp.keySet())
		for (Map.Entry<String, Integer> pair : Voter_dao.High_Vote_Candidate().entrySet())    
		{
			%>
		<tr>
	    <td><% out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));%></td>
	    </tr>		  	
	               <%
	              		}
	              %>
 
</body>
</html>