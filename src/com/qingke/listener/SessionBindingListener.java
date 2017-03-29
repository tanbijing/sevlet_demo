package com.qingke.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class SessionBindingListener
 *
 */
@WebListener
public class SessionBindingListener implements HttpSessionBindingListener {

    /**
     * Default constructor. 
     */
    public SessionBindingListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("================binding create");
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("================binding");
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    	System.out.println("================unbinding create");
    }
	
}
