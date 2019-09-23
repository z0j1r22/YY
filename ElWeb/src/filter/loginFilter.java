package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "loginFilter",urlPatterns = {"/admin/*","*.action"})
public class loginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response= (HttpServletResponse) resp;
        //获取session
        HttpSession session=request.getSession();
        //获取项目的根目录：/web2
        String contextPath=request.getContextPath();
        //获取请求的路径
        String requestUrl=request.getRequestURI();
        //判断是否是登录相关页面，不拦截
        if (requestUrl.indexOf("login")>-1){
            chain.doFilter(req, resp);
        }else {
            //如果session 中没有用户信息
            if (session.getAttribute("user")==null){
                response.sendRedirect(contextPath+"/login.jsp");
            }else {
                //已登录
                chain.doFilter(req,resp);
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
