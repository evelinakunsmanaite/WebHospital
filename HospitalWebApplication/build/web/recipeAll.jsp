<%-- 
    Document   : result
    Created on : 21 мая 2023 г., 18:29:20
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/resultcss.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
            <th>Номер рецепта</th>
            <th>Пациент</th>
            <th>Название лекарства</th>
            <th>Доза</th>
            <th>Метод приёма</th>
        </thead>

        <!-- Итерация по элементам коллекции "result" -->
        <c:forEach var="ab" items="${result}">
            <tr>
                <td>${ab.number}</td>
                <td>${ab.patient}</td>
                <td>${ab.drugName}</td>
                <td>${ab.dose}</td>
                <td>${ab.receptionMethod}</td>

            </tr>
        </c:forEach>
    </table>
    <a href="cabinet.jsp">Назад</a>

</body>
</html>
