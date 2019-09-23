package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "IPFilter",urlPatterns = "/*")
public class IPFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response= (HttpServletResponse) resp;
        /**
         *1,获取到请求的IP地址
         * 2，判断是否符合要求，符合要求，继续，不符合要求，报错
         */
        //获取到请求的IP地址
        String ip=req.getRemoteAddr();
        if (ip.startsWith("211.")){
            //向客户端发送一个带有状态码的错误消息
            response.sendError(HttpServletResponse.SC_FORBIDDEN,"禁止指定的IP访问");
        }else {
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
