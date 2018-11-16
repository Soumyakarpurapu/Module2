<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Answer the Query</h1>
<a:forEach var="clt" items="${data}">
<label>Query Id:  ${clt.id}</label><br>
<label>Select Technology:  ${clt.technology}</label><br>
<label>Question:	${clt.question}</label><br>
<label>Question Raised By: ${clt.name}</label><br>
<label>Solution:	<form:input path="solution" size="100" /></label><br>
<label>Answered by: 
<select id="myList" >
<option="Uma"/>
<option="Rahul"/>
<option="Kavita"/>
<option="Hema"/></select></label><br>
<a href="Update">Update Query</a>
</a:forEach>

</body>
</html>