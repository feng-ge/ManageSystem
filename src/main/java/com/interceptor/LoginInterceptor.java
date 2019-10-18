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
//        System.out.println(url);
        if (url.indexOf("/personal") >= 0) {

            HttpSession session = request.getSession();
            String user = (String) session.getAttribute("user_session");
            if (user != null) {
                System.out.println("true");
                System.out.println(user);
                return true;
            }
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }

}
