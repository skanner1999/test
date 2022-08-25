package com.example.test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupServ")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        // code to process the form...
        Database db = new Database();
        String username = request.getParameter("username");
        String first_name = request.getParameter("firstName");
        String last_name = request.getParameter("lastName");
        String password = request.getParameter("pwd");
        try {
            db.Insert(username, first_name, last_name, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
