package cn.tianyu.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Enumeration;

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

    /*
    * 探究FilterConfig
    * */
    public void init(FilterConfig config) throws ServletException {
        /*System.out.println("AFilter init....");
        String filterName = config.getFilterName();
        String val = config.getInitParameter("firstName");
        Enumeration names = config.getInitParameterNames();
        System.out.println(filterName);
        System.out.println(val);
        while(names.hasMoreElements())
        {
            String name =  (String) names.nextElement();
            String value = config.getInitParameter(name);
            System.out.println(name+" = "+value);
        }*/
    }

}
