package com.qingke.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("================= context creat");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("================= context del");
    	sce.getServletContext().removeAttribute("value");
    	sce.getServletContext().removeAttribute("value1");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("================= context init");
    	sce.getServletContext().setAttribute("value", "tom");
//    	sce.getServletContext().setAttribute("value", "cat");
//    	sce.getServletContext().setAttribute("value1", "new tom");
    } 
	
}
