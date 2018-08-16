

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ApplicationServletContextListener implements ServletContextListener 
{
    public void contextDestroyed(ServletContextEvent arg0) 
    { 
    	System.out.println("on context destroyed");
    }

	
    public void contextInitialized(ServletContextEvent arg0) 
    { 
    	System.out.println("on context created");
    }
	
}
