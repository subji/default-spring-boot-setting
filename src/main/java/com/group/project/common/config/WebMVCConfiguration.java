package com.group.project.common.config;

import java.util.concurrent.TimeUnit;

import com.group.project.common.interceptor.DemoInterceptor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;
import org.springframework.web.servlet.resource.VersionResourceResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * WebMVCConfiguration
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.daumsoft.monitoring")
public class WebMVCConfiguration implements WebMvcConfigurer {

  private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { 
		"classpath:/lib/", 
		"classpath:/public/",
		"classpath:/static/", 
		"classpath:/resources/", 
		"classpath:/META-INF/resources/",
	};

  @Override
  public void addResourceHandlers (ResourceHandlerRegistry registry)  {
    registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS)
    // Cacheable static assets with configuration
    .resourceChain(false)
    .addResolver(new VersionResourceResolver().addContentVersionStrategy("/**"));
  }

  @Override
  public void configureViewResolvers (ViewResolverRegistry registry) {
    InternalResourceViewResolver bean = new InternalResourceViewResolver();
    bean.setSuffix(".jsp");
    bean.setPrefix("/WEB-INF/views/");
    bean.setViewClass(JstlView.class);
    registry.viewResolver(bean);
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(demoInterceptor())
    .addPathPatterns("/**")
    .excludePathPatterns("/**");
  }
  
  @Bean
  DemoInterceptor demoInterceptor () {
    return new DemoInterceptor();
  }

  /**
   * Cacheable static assets with configuration
   * @return
   */
  @Bean
  public ResourceUrlEncodingFilter resourceUrlEncodingFilter() {
    return new ResourceUrlEncodingFilter();
  }

}