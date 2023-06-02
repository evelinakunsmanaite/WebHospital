/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import entity.User;
import entity.UsersList;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/helloServlet"})
public class HelloServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // Получение значения параметров "login" и "password" из запроса
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        // Получение массива пользователей из класса UsersList
        User[] users = UsersList.getUsers();

        RequestDispatcher rd;

        // Поиск пользователя с заданными логином и паролем
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(pass)) {
                // Если пользователь найден, сохраняем его данные в сессии
                request.getSession().setAttribute("firstName", user.getFirstName());
                request.getSession().setAttribute("middleName", user.getMiddleName());

                // Перенаправление на страницу "cabinet.jsp"
                rd = getServletContext().getRequestDispatcher("/cabinet.jsp");
                rd.forward(request, response);
                return;
            }
        }

        // Если пользователь не найден, устанавливаем атрибут "error" для отображения ошибки авторизации
        request.setAttribute("error", "Ошибка авторизации");

        // Перенаправление на страницу "error.jsp"
        rd = getServletContext().getRequestDispatcher("/error.jsp");
        rd.forward(request, response);
    }
}
