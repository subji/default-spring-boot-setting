package com.group.project.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;

public class DemoInterceptor implements HandlerInterceptor {

  @Value("${app.version}")
  private String APP_VERSION;
  
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
    HttpSession session = request.getSession();
    
    session.setAttribute("APP_VERSION", APP_VERSION);
		//컨트롤러로 진행
		return true;
	}
}