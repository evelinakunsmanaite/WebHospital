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
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Отчество</th>
            <th>Номер телефона</th>
            <th>Карта</th>
            <th>Диагноз</th>
            <th>Дата рождения</th>
            <th>Адрес</th>
        </thead>
        
         <!-- перебор по элементам "result" -->
        <c:forEach var="ab" items="${result}">
            <tr>
                <td>${ab.lastName}</td>
                <td>${ab.firstName}</td>
                <td>${ab.middleName}</td>
                <td>${ab.phoneNumber}</td>
                <td>${ab.card}</td>
                <td>${ab.diagnosis}</td>
                <td>${ab.birthDate}</td>
                <td>${ab.address}</td>
            </tr>
        </c:forEach>
    </table>
        
    <a href="cabinet.jsp">Назад</a>
    </body>
</html>
