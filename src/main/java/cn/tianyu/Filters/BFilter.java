package cn.tianyu.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "BFilter")
public class BFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("BFilter.doFiler...before");
        chain.doFilter(req, resp);
        System.out.println("BFilter.doFiler...after");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
