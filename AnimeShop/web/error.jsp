<%-- 
    Document   : error
    Created on : 21 мая 2023 г., 18:30:03
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/error.css" rel="stylesheet" />

        <title>Ошибка</title>
    </head>
    <body>
        <div class="container">
        <h1 style='color:red;'>${error}</h1>
        <a href="index.jsp">Назад</a>   
        </div>
    </body>
</html>
