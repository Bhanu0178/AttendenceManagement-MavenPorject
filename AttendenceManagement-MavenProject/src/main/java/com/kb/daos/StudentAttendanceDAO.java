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
			PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENTATTENDENCE01 VALUES(?,?,?,?,?,?,?,?)");
			ps.setString(1, sab.getRollNo());
			ps.setString(2, sab.getSub1());
			ps.setString(3, sab.getSub2());
			ps.setString(4, sab.getSub3());
			ps.setString(5, sab.getSub4());
			ps.setString(6, sab.getSub5());
			ps.setString(7, sab.getSub6());
			ps.setString(8, sab.getAttdate());
			k = ps.executeUpdate();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return k;
	}
}
