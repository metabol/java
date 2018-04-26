<%-- page content directive --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp"  %>


<html>
<head>


<title>JSP test page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>


<%-- page import  directive --%>
<%@ page import="java.util.Date" %>


<%-- Declaration --%>
<%! String greet =" Clock :"; %>
<%! Date now(){ return new Date(); } %>


<%-- Expression  --%>
<%= greet %>
<b>Current date and time is: <%= now() %></b><br>

<%-- application object --%>
<% application.setAttribute("app","Java Server Pages"); %>

<%-- include directive --%>
<%@include file="login.jsp" %>

<br><a href="display.jsp">Technology</a>





<a></a>

<body>

</body>
</html>