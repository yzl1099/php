package com.jsp.main;

import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

public class MyServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("---------------init-----------------");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-----------------service-------------------");
		
		doHead(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-----------------doget----------------------");
		String name = getInitParameter("name");
		String age = getInitParameter("age");
		System.out.println(name+"__"+age);
//		req.getRequestDispatcher("success.jsp").forward(req, resp);
//		doPost(req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-------------------dohead----------------------");
		Enumeration initParameterNames = getInitParameterNames();
		while (initParameterNames.hasMoreElements()) {
			String str = (String) initParameterNames.nextElement();
			System.out.println(str);
		}
		req.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("---------------doPost---------------------");
//		resp.sendRedirect("success.jsp");
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("---------------------dodelete-------------------------");
		super.doDelete(req, resp);
		req.getAttributeNames();
		req.getCharacterEncoding();
	}
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("---------------destroy------------------");
		super.destroy();
	}
	
}
