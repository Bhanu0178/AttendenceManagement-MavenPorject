package com.kb.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kb.beans.StudentAttendanceBean;
import com.kb.daos.StudentAttendanceDAO;

@SuppressWarnings("serial")
@WebServlet("/studentattendanceform")
public class StudentAttendanceServlet extends HttpServlet
{
	private StudentAttendanceBean sab = null;
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
			String sname = req.getParameter("sname");
			String sub1 = req.getParameter("sub1");
			String sub2 = req.getParameter("sub2");
			String sub3 = req.getParameter("sub3");
			String sub4 = req.getParameter("sub4");
			String sub5 = req.getParameter("sub5");
			String sub6 = req.getParameter("sub6");
			String attDate = req.getParameter("attdate");
			sab = new StudentAttendanceBean();
			sab.setRollNo(rollNo);
			sab.setName(sname);
			sab.setSub1(sub1);
			sab.setSub2(sub2);
			sab.setSub3(sub3);
			sab.setSub4(sub4);
			sab.setSub5(sub5);
			sab.setSub6(sub6);
			sab.setAttdate(attDate);
			int k = new StudentAttendanceDAO().add(sab);
			if(k>0)
			{
				req.setAttribute("sab", sab);
				req.getRequestDispatcher("StudentAttendanceJsp.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "Already Added Attendance...<br>");
				req.getRequestDispatcher("Home.jsp").forward(req, res);
			}
		}
	}
}
