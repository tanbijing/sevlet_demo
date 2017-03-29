package com.qingke.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextAttrListener
 *
 */
@WebListener
public class ContextAttrListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextAttrListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("================= context attr listener creat");
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	System.out.println("================= add attr");
    	System.out.println("attr value:"+scae.getServletContext().getAttribute("value"));
//    	System.out.println("attr value1:"+scae.getServletContext().getAttribute("value1"));
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	System.out.println("================= del attr");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         // TODO Auto-generated method stub
    	System.out.println("================= update attr");
    }
	
}
