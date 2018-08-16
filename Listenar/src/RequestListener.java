

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


public class RequestListener implements ServletRequestListener {

 
    public void requestDestroyed(ServletRequestEvent arg0)  
    { 
         System.out.println("request object destroyed");
    }

    public void requestInitialized(ServletRequestEvent arg0) 
    { 
    	System.out.println("request object created");
    }
	
}
