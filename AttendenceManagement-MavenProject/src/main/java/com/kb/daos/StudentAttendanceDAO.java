package com.kb.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kb.beans.StudentAttendanceBean;
import com.kb.services.DBConnection;

public class StudentAttendanceDAO 
{
	private int k = 0;
	public int add(StudentAttendanceBean sab)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTATTENDENCE01 VALUES()");
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return k;
	}
}
