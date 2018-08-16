

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionListener implements HttpSessionListener 
{

  
    public void sessionCreated(HttpSessionEvent arg0) 
    { 
         System.out.println("on session creation");
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0) 
    { 
    	System.out.println("on session destroyed");
    }
	
}
