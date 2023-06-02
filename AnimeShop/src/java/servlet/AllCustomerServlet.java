/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;


import entity.Customer;
import entity.CustomerList;
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
@WebServlet(name = "AllCustomerServlet", urlPatterns = {"/allCustomerServlet"})
public class AllCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
     
        
       request.setAttribute("result", CustomerList.getCustomer());
        RequestDispatcher rd = getServletContext()
                .getRequestDispatcher("/result.jsp");
        rd.forward(request, response);       
    }
}