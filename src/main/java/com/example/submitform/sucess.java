package com.example.submitform;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class sucess extends HttpServlet {
    public void doPost(HttpServletRequest  req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter put= res.getWriter();
        put.println("this is sucess");
        put.println("<h2>sucessfully registered</h2>");
    }
}
