package com.example.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value = "/servlet2")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //session เน้นเก็บทางฝั่ง server พวกข้อมูลของ user บลาๆ (มีความปลอดภัยมากกว่า cookies) จะหายไปก็ต่อเมื่อ user ปิด tab ต่างๆ
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("Name=" + name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
