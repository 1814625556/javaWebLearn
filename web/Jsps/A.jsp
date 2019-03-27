<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/3/27
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a</title>
</head>
<body>
<h1>a.jsp</h1>
<%
    request.getRequestDispatcher("/Jsps/B.jsp").forward(request, response);
%>
</body>
</html>
