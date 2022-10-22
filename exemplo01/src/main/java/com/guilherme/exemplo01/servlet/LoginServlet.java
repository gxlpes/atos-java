package com.guilherme.exemplo01.servlet;

import com.guilherme.exemplo01.entity.User;
import com.guilherme.exemplo01.repository.LoginRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    LoginRepository loginRepository = new LoginRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        loginRepository.setup();

        User user = loginRepository.findByUsernameAndPassword(username, password);

        if (user == null) {
            response.getWriter().append("Usuário ou senha inválidos");
        } else {
            response.getWriter().append("Bem-vindo ").append(user.getUsername());
            return;
        }
    }
}
