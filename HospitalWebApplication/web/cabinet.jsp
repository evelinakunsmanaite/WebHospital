<%-- 
    Document   : cabinet
    Created on : 19 мая 2023 г., 08:46:42
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/cabinetcss.css" rel="stylesheet" />
        <title>Cabinet</title>
    </head>
    <body>
        <header> <div id="sidebar">
                <nav class="nav">
                    <ul>
                        <li class="active"><a href="#" title="Возможности" onclick="slowScroll('#top')">Добро пожаловать</a></li>
                        <li class="active"><a href="#" title="Возможности" onclick="slowScroll('#main')">Списки данных</a></li>
                        <li class="active"><a href="#" onclick="slowScroll('#overview')" title="Преимущества">Добавить рецепт</a></li> 
                             <li ><a href="index.jsp">Назад</a> 
                        </li></ul></nav>
            </div>
        </header>

        <div id="top">
            <div class="container">
                <img src="resources/img/icon.png" alt="" class="round">
                <h2>Добро пожаловать!</h2>
                <h3><%= session.getAttribute("firstName")%> <%= session.getAttribute("middleName")%></h3>
            </div> 
        </div> 

        <div id="main">
            <h2>Списки данных</h2>
            <form class="input-form" action="diagnosisServlet" method="post">
                <label>Вывести пациентов с заданным диагнозом:
                    <div class="input-container">
                        <input type="text" name="diagnosis" required placeholder="Введите диагноз">
                        <input type="submit" value="Отправить">
                    </div></label>
            </form>       

            <form class="input-form" action="medicalCardServlet" method="post">
                <label>Вывести пациентов с заданным номером мед карты:
                    <div class="input-container">
                        <input type="text" name="cardNumber" required placeholder="Введите номер медицинской карты">
                        <input type="submit" value="Отправить">
                    </div></label>
            </form>
            
            <form class="input-form" action="setRecipeServlet" method="get">
                <label>Вывести рецепты:
                    <div class="input-container">
                        <input type="submit" value="Отправить">
                    </div></label>
            </form>
        </div>

        <div id="overview">
            <div class="intro">
                <h2>Добавление рецепта</h2>
                <br>
<form action="setRecipeServlet" method="post" >
    <label for="patientID">ID Пациента:</label>
    <input type="number" id="patientID" name="patientID" required><br>
    
    <label for="number">Номер лекарства:</label>
    <input type="number" id="number" name="number" required><br>
    
    <label for="drugName">Название лекарства:</label>
    <input type="text" id="drugName" name="drugName" required><br>
    
    <label for="dose">Доза:</label>
    <input type="number" id="dose" name="dose" required><br>
    
    <label for="receptionMethod">Метод приема:</label>
    <select id="receptionMethod" name="receptionMethod" required>
        <option value="" disabled selected hidden>Выберите метод приема</option>
        <option value="INTRAMUSCULARLY">Внутримышечно</option>
        <option value="INTRAVENOUSLY">Внутривенно</option>
        <option value="ORALLY">Перорально</option>
        <option value="RICTALLY">Ригтально</option>
    </select><br>
    
    <input type="submit" value="Отправить">
</form>            
            </div>


        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script>
                            function slowScroll(id) {
                                $('html, body').animate({
                                    scrollTop: $(id).offset().top
                                }, 500);
                            }
                            $(document).on("scroll", function () {
                                if ($(window).scrollTop() === 0)
                                    $("header").removeClass("fixed");
                                else
                                    $("header").attr("class", "fixed");
                            });
        </script>
    </body>
</html>