<%@page import="java.util.Map"%>
<%@page import="com.dao.Voter_dao"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.Candidate_dao"%>
<%@page import="com.bean.Candidate_bean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<!-- List<String> list=Candidate_dao.getAllCandidateList();
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Name</th></tr>");
		for(String e:list){
			out.print("<tr><td>"+e);
	
	Candidate_dao cd = new Candidate_dao();
	out.print("List : "+ cd.mp.toString());

	for(String e:list)
	for(String key: map.keySet()){
    System.out.println(key);
}
		
 -->
<body>
	 <% 
	 out.print("<center>");
	out.print("<table border='1' width='20%'");
	out.print("<tr><th>Voting Summary</th></tr>");
	
 
	//for(String key:Candidate_dao.mp.keySet())
	for (Map.Entry<String, Integer> pair : Candidate_dao.mp.entrySet())    
	{
		%>
	<tr>
    <td><% out.println(String.format("%s : %s", pair.getKey(), pair.getValue()));%></td>
    </tr>		  	
               <%
              		}
	  out.print("</center>");
	%>
  
</body>
</html>