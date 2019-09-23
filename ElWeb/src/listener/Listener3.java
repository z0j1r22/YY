package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class Listener3 implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session属性添加:"+event.getSession()+":"+event.getName()+":"+event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session属性移除:"+event.getSession()+":"+event.getName()+":"+event.getValue());

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session属性替换:"+event.getSession()+":"+event.getName()+":"+event.getValue());

    }
}
