/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import entity.Patient;
import entity.PatientsList;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "DiagnosisServlet", urlPatterns = {"/diagnosisServlet"})
public class DiagnosisServlet extends HttpServlet {

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
        try {
            String diagnosis = request.getParameter("diagnosis");
            Patient[] patients = PatientsList.getPatients();
            ArrayList<Patient> result = new ArrayList<>();

            // Поиск пациентов с заданным диагнозом и добавление их в результат
            for (Patient patient : patients) {
                if (patient.getdiagnosis().equals(diagnosis)) {
                    result.add(patient);
                }
            }
            request.setAttribute("result", result);
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", "Ошибка ввода данных");
            RequestDispatcher rd = getServletContext()
                    .getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
        }
    }
}
