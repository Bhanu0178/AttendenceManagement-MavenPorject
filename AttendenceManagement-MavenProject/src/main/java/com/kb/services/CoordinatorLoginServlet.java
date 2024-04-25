package com.kb.services;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kb.daos.CoordinatorLoginDAO;
import com.nt.beans.CoordinatorLoginBean;

@SuppressWarnings("serial")
@WebServlet("/coordinatorlogin")
public class CoordinatorLoginServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
		String rollNo = req.getParameter("rollno");
		CoordinatorLoginBean clb = new CoordinatorLoginDAO().login(rollNo);
		if(clb==null)
		{
			req.setAttribute("msg", "Invalid Login details..<br>");
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("coordinatorloginbean", clb);
			RequestDispatcher rd = req.getRequestDispatcher("CoordinatorLoginJsp.jsp");
			rd.forward(req, res);
		}
	}
}
