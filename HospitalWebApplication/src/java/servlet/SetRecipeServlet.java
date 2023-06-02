/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import entity.Patient;
import entity.PatientsList;
import entity.Recipe;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "SetRecipeServlet", urlPatterns = {"/setRecipeServlet"})
public class SetRecipeServlet extends HttpServlet {

    private List<Recipe> recipes = new ArrayList<>();

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

        // Получение параметров из запроса
        int patientId = Integer.parseInt(request.getParameter("patientID"));
        int number = Integer.parseInt(request.getParameter("number"));
        String drugName = request.getParameter("drugName");
        double dose = Double.parseDouble(request.getParameter("dose"));
        String receptionMethod = request.getParameter("receptionMethod");

        try {
            // Получение объекта пациента по идентификатору
            Patient patient = PatientsList.getPatientById(patientId);

            // Создание объекта рецепта
            Recipe recipe = new Recipe(number, patient, drugName, dose, receptionMethod);

            // Добавление рецепта в список
            recipes.add(recipe);

            // Установка атрибута "result" в запросе для передачи списка рецептов в следующий JSP-файл
            request.setAttribute("result", recipes);

            // Перенаправление на страницу "recipeAll.jsp"
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/recipeAll.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            // Обработка исключения при возникновении ошибки
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Установка атрибута "result" в запросе для передачи списка рецептов в следующий JSP-файл
            request.setAttribute("result", recipes);

            // Перенаправление на страницу "recipeAll.jsp"
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/recipeAll.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            // Обработка исключения при возникновении ошибки
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }
    }
}
