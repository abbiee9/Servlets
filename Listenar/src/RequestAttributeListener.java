

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;


public class RequestAttributeListener implements ServletRequestAttributeListener
{
    public void attributeRemoved(ServletRequestAttributeEvent arg0) 
    { 
         System.out.println("attribute removed to request object");
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0) 
    { 
    	System.out.println("attribute added to request object");
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0) 
    { 
    	System.out.println("attribute replaced to request object");
    }
	
}
