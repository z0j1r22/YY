package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class OnLine implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    private List<String> users=new ArrayList<>();
    @Override
    public void contextInitialized(ServletContextEvent event) {
        //获取上下文对象，添加属性
        event.getServletContext().setAttribute("users",users);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //获取登录的用户信息
        String user=event.getValue().toString();
        //如果集合中不存在该用户
        if(!users.contains(user))
            users.add(user);//添加
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        //获取移除的用户信息
        String user=event.getValue().toString();
        //如果集合中存在该用户
        if(users.contains(user))
//            移除
            users.remove(user);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
