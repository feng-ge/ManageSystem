package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object test) throws ServletException, IOException {
        String url = request.getRequestURI();
//        Cookie[] cookies = request.getCookies();
//        System.out.println(url);
        if (url.indexOf("/personal") >= 0 || url.indexOf("/submissionbook") >= 0) {

            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username_session");
//            System.out.println(username);
            if (username != null) {
//                response.getWriter().print(user);
//                System.out.println(user);
                return true;
            }
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().print("<script   language=javascript>alert('请先登录！');window.location='/login'</script>");
//            response.sendRedirect("/login");
            return false;
        }
        if (url.indexOf("/login") >= 0 || url.indexOf("/register") >= 0) {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username_session");
//            System.out.println(username);
            if (username != null) {
//                response.getWriter().print(user);
//                System.out.println(user);
                response.sendRedirect("/");
                return false;
            }

        }

        return true;
    }

}
