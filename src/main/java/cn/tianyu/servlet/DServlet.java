package cn.tianyu.servlet;

import cn.tianyu.domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DServlet",urlPatterns = "/DServlet")
public class DServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Person p = new Person("zhangSan", 23, "male");
        request.getSession().setAttribute("person", p);
        System.out.println("Session.setAttribute......");
        request.getSession().removeAttribute("person");
        System.out.println("Session.removeAttribute......");
        response.getWriter().write("DServlet....");
    }
}
