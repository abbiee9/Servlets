

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ApplicationServletContextAttributeListener implements ServletContextAttributeListener 
{
    public void attributeAdded(ServletContextAttributeEvent arg0) 
    { 
    	 System.out.println("attribute added to application object");
    }

    public void attributeRemoved(ServletContextAttributeEvent arg0)
    { 
    	System.out.println("attribute removed to application object");
    }

    public void attributeReplaced(ServletContextAttributeEvent arg0)  
    { 
    	System.out.println("attribute replaced to application object");
    }
	
}
