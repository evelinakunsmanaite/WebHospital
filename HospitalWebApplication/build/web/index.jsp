<%-- 
    Document   : login
    Created on : 19 мая 2023 г., 08:12:08
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="resources/css/logincss.css" rel="stylesheet" />
    </head>
    <body>
        <div class="registration">
            <form method="post" action="helloServlet">
                <h2>Вход</h2><br>
                <div class="form-group">
                    <input class="form-control item" type="text" name="login" 
                           maxlength="15" minlength="4" pattern="^[a-zA-Z0-9_.-]*$" 
                           id="login" placeholder="Логин" required>
                </div>
                <div class="form-group">
                    <input class="form-control item" type="password" name="password" 
                           minlength="6" id="password" placeholder="Пароль" required>
                </div>
                <div class="form-group">
                    <input type="submit" name="signin" id="signin"
                           class="submit" value="войти" />
                </div>
            </form>
        </div>
    </body>
</html>

