<%-- 
    Document   : cabinet
    Created on : 22 мая 2023 г., 01:37:36
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/cabinet.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
    <body>
                <img src="resources/img/pngwing.com.png" alt="" class="round">

        <h2>Добро пожаловать, <%= session.getAttribute("firstName")%> <%= session.getAttribute("middleName")%></h2>

        <form class="input-form" action="allCustomerServlet" method="get">
                <label>Cписок покупателей:
                    <div class="input-container">
                        <input type="submit" value="Отправить">
                    </div></label>
            </form>      
            
            <form class="input-form-second" action="customerIntervalServlet" method="post">
                <label>Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале:
                         <div class="input-container-second">
                       <input type="text" name="from" required placeholder="минимальное значение"></div>
                       <div class="input-container-second">
                       <input type="text" name="to" required placeholder="максимальное значение"></div>
                        <input type="submit" value="Отправить">
                    </label>
            </form>

        <a href="index.jsp">Назад</a>  


    </body>
</html>