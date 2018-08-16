

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class SessionAttributeListener implements HttpSessionAttributeListener
{

    
    public void attributeAdded(HttpSessionBindingEvent arg0)  
    { 
       System.out.println("attribute added to session object");
    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  
    { 
    	  System.out.println("attribute removed to session object");
    }

	
    public void attributeReplaced(HttpSessionBindingEvent arg0)  
    { 
    	  System.out.println("attribute replaced to session object");
    }
	
}
