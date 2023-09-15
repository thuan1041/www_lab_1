package vn.edu.iuh.fit.lab_week_01.controllers;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.lab_week_01.models.Account;
import vn.edu.iuh.fit.lab_week_01.repositories.AccountRepository;

import java.util.List;

@WebServlet("/ControllerServletCreateAccount")
public class ControllerServletCreateAccount extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        AccountRepository accountRepository = new AccountRepository();
        List<Account> accountList = accountRepository.getAll();
    }
}
