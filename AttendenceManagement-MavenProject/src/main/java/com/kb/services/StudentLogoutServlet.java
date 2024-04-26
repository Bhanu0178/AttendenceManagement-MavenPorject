package com.kb.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kb.beans.StudentLoginAttendanceBean;

public class StudentLogoutServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session Expired...<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("StudentLogoutJsp.jsp").forward(req, res);
		}
	}
}
