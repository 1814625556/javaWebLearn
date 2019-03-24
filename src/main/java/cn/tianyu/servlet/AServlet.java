package cn.tianyu.servlet;

import java.io.IOException;

public class AServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.getWriter().print("大家好");
        System.out.println("AServlet.doPost");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.getWriter().print("hello everyone..");
        System.out.println("AServlet.doGet");
    }
}
