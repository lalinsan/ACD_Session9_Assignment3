/*
* Student: Eduardo Aguirre
* Session 9
* Assignment 3
* Servlet that returns the Session information.
* Sets the visiting Count
* Formats Date
* 
*/



package com.Acadgild.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int visitCount=1;

	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Service Method executed");
		PrintWriter out = response.getWriter();
		out.println("Servlet Life Cycle");
		HttpSession session = request.getSession(true);
		session.setAttribute("session", true);
		session.setAttribute("id", session.getId());
		session.setAttribute("visitCountKey",  visitCount++);
		long createTime = session.getCreationTime();
		long lastAccessTime = session.getLastAccessedTime();
		session.setAttribute("lastAccessTime", lastAccessTime);
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("E MMM d h:m:s yyyy");
		d.setTime(createTime);

		System.out.println(f.format(d));
		session.setAttribute("createTime", f.format(d));
		
		d.setTime(lastAccessTime);
		session.setAttribute("lastAccessTime", f.format(d));
		
	}
	
}
