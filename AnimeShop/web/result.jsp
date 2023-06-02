<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/result.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
    <body><div class="container">
  <c:choose>
    <c:when test="${not empty result}">
      <table>
        <thead>
          <th>ID покупателя</th>
          <th>Фамилия покупателя</th>
          <th>Имя покупателя</th>
          <th>Отчество покупателя</th>
          <th>Номер кредитной карточки</th>
          <th>Номер банковского счёта</th>
        </thead>
        <c:forEach var="a" items="${result}">
          <tr>
            <td>${a.id}</td>
            <td>${a.lastName}</td>
            <td>${a.name}</td>
            <td>${a.middleName}</td>
            <td>${a.bankAccountNumber}</td>
            <td>${a.cardAccountNumber}</td>
          </tr>
        </c:forEach>
      </table>
    </c:when>
    <c:otherwise>
      <c:out value="искомые данные отсутствуют" />
    </c:otherwise>
  </c:choose>
            <img src="resources/img/pngwing.png" alt="" class="round">
</div>
    <a href="cabinet.jsp">Назад</a>  
</body>
</html>
