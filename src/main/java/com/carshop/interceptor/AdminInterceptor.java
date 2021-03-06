package com.carshop.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器，该拦截器拦截/admin/* 的内容
 */
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        // 获取请求uri
        String uri = request.getRequestURI();
        // 如果是登录请求，放行
        if (uri.indexOf("/seller/SellerLogin") >= 0)
            return true;

        // 获取session
        HttpSession session = request.getSession();
        Object admin = session.getAttribute("admin");
        Object user = session.getAttribute("user");
        Object seller = session.getAttribute("seller");
        if (user != null)
            return true;

        if (admin != null)
            return true;

        if (seller != null)
            return true;

        // 未登录且不是指定的页面，转发到登录页面
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        return false;
    }
}
