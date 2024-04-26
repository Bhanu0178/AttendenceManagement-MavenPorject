package com.kb.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kb.beans.StudentLoginAttendanceBean;
import com.kb.daos.StudentLoginAttendanceDAO;

@SuppressWarnings("serial")
@WebServlet("/studentloginattendance")
public class StudentLoginAttendanceServlet  extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			String rollNo = req.getParameter("rollno");
			StudentLoginAttendanceBean slab = new StudentLoginAttendanceDAO().login(rollNo);
			if(slab==null)
			{
				req.setAttribute("msg", "Invalid login details..<br>");
				req.getRequestDispatcher("Home.jsp").forward(req, res);
			}
			else
			{
				hs.setAttribute("slab", slab);
				req.getRequestDispatcher("StudentLoginAttendanceJsp.jsp").forward(req, res);
			}
		}
	}
}
