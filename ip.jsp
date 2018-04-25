<html>
<head>
<title> Embedded JSP Scriplet</title>
</head>
<body>
<h1>
<%
   out.println("My Ip address is: " + request.getRemoteAddr());
%>

</h1>
</body>
</html>