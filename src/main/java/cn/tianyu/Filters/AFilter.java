package cn.tianyu.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

public class AFilter implements Filter {
    public void destroy() {
        System.out.println("AFilter destroy....");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("AFilter doFilter....");
        chain.doFilter(req, resp);
        System.out.println("AFilter doFilter after....");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("AFilter init....");
    }

}
