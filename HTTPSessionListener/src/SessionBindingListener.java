

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionBindingListener implements HttpSessionBindingListener 
{


    public void valueBound(HttpSessionBindingEvent arg0)  
    { 
        System.out.println("object added to session");
    }

    public void valueUnbound(HttpSessionBindingEvent arg0)  
    { 
    	System.out.println("object removed from session");
    }
	
}
