package com.group.project.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class DemoInterceptor implements HandlerInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(DemoInterceptor.class);

  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    logger.debug("Demo Interceptor");

		//컨트롤러로 진행
		return true;
	}
}