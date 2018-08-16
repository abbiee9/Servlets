

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class examM3 implements HttpSessionBindingListener 
{


    public void valueBound(HttpSessionBindingEvent arg0)  
    { 
        System.out.println("B");
    }

    public void valueUnbound(HttpSessionBindingEvent arg0)  
    { 
    	System.out.println("UB");
    }
	
}
