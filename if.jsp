<html>
<head>
<title> Embedded JSP Scriplet</title>
</head>
<body>
<h1>
<%! int day = 3; %>


<%
   if(day == 1 || day == 7){
     out.println("Today is Weekend ..yuhuu");
   }
    else{ 
       out.println("Today is workday");
     }
%>

</h1>
</body>
</html>