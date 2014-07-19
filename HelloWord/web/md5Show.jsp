<%-- 
    Document   : md5Show
    Created on : Jul 19, 2014, 7:54:59 AM
    Author     : M
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MD5 show</title>
    </head>
    <body>
        <p>MD5 hash response: <%=request.getAttribute("md5hash") %> </p>
        <a href="index.jsp">Back to main page</a>
    </body>
</html>
