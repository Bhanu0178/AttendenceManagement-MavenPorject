package com.kb.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kb.beans.StudentLoginAttendanceBean;
import com.kb.services.DBConnection;

public class StudentLoginAttendanceDAO 
{
	private StudentLoginAttendanceBean slab = null;
	
	public StudentLoginAttendanceBean login(String rollNo)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM STUDENTLOGIN01 WHERE ROLLNO=?");
			ps.setString(1, rollNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				slab = new StudentLoginAttendanceBean();
				slab.setName(rs.getString(1));
				slab.setRollNo(rs.getString(2));
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return slab;
	}
	
}
