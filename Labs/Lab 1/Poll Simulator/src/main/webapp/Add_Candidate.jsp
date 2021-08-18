<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<center><p style="font-size:40px;">ADD CANDIDATE</p></center>
		<form action="Add_Candidate_Servlet" method="post">
			<label style="font-size:20px;">Enter candidate Name :</label>
			<input type="text" name="can_name" placeholder="Enter Name">
			<input type="submit" value="submit">
		</form>	
</body>
</html>