package com.springweb.app;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@WebFilter(urlPatterns = "/filtroLogin/*")
public class FiltroLogin implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("FiltroLogin :: doFilter");

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		System.out.println("Request URI is: " + req.getRequestURI());
		System.out.println("Response Status Code is: " + res.getStatus());

		// Esto se hace por si hay más filtros que ejecute los siguientes.
		chain.doFilter(request, response);
	}

}