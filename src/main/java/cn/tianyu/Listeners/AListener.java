package cn.tianyu.Listeners;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class AListener implements ServletContextListener,ServletRequestListener,
        HttpSessionListener ,ServletContextAttributeListener{

    // Public constructor is required by servlet spec
    public AListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed).
         You can initialize servlet context related data here.
      */
      System.out.println("创建servletContext对象.....");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context
         (the Web application) is undeployed or
         Application Server shuts down.
      */
        System.out.println("消除servletContext对象.....");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
      /* Session is created. */
      System.out.println("创建session......");
    }

    public void sessionDestroyed(HttpSessionEvent se) {
      /* Session is destroyed. */
        System.out.println("消除session......");
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(ServletContextAttributeEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
        System.out.println("从ServletContext中添加属性：" + sbe.getName() + "=" + sbe.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
        System.out.println("从ServletContext中移除属性：" + sbe.getName() + "=" + sbe.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
        System.out.println("从ServletContext中修改属性：" + sbe.getName() + "=" + sbe.getValue());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
       /* ServletContext context = servletRequestEvent.getServletContext();
        ServletRequest request = servletRequestEvent.getServletRequest();
        String servletName = context.getServletContextName();
        System.out.println(servletName);*/
        System.out.println("销毁request对象......");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("创建request对象......");
    }
}
