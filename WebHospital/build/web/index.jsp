<%-- 
    Document   : index
    Created on : 18 мая 2023 г., 22:42:18
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="resources/css/css.css" rel="stylesheet" />
    </head>
    <body>
        <div class="registration">
            <form>
                <h2>Вход</h2><br>
                <div class="form-group">
                    <input class="form-control item" type="text" name="username" 
                           maxlength="15" minlength="4" pattern="^[a-zA-Z0-9_.-]*$" 
                           id="username" placeholder="Логин" required>
                </div>
                <div class="form-group">
                    <input class="form-control item" type="password" name="Пароль" 
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
