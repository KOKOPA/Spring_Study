package com.hello.mvc03.common.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		req.setCharacterEncoding("UTF-8");
		
		String remoteAddr = StringUtils.defaultString(req.getRemoteAddr().toString() + "\n");
		String uri = StringUtils.defaultString(req.getRequestURI() + "\n");
		String url = StringUtils.defaultString(req.getRequestURL().toString() + "\n");
		String queryString = StringUtils.defaultString(req.getQueryString() + "\n");
		String parameter = StringUtils.defaultString(req.getParameter("id") + "\n");
		String referer = StringUtils.defaultString(req.getHeader("referer") + "\n");
		String agent = StringUtils.defaultString(req.getHeader("User-Agent") + "\n");
		StringBuffer sb = new StringBuffer();
		sb.append(remoteAddr)
		.append(uri)
		.append(url)
		.append(queryString)
		.append(parameter)
		.append(referer)
		.append(agent);
		
		
		logger.info("[LOG FILTER] " + sb.toString());
		
		chain.doFilter(req, response);
		
	}

	@Override
	public void destroy() {

	}

}
