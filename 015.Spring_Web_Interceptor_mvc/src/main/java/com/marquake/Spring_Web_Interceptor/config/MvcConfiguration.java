package com.marquake.Spring_Web_Interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.marquake.Spring_Web_Interceptor.interceptors.MiInterceptor;


@Configuration
@ComponentScan(basePackages="com.marquake.Spring_Web_Interceptor")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Autowired
	MiInterceptor miInterceptor;

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}



	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor( new MiInterceptor() );
	}
	
}
