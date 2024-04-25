package com.kb.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kb.services.DBConnection;
import com.nt.beans.CoordinatorLoginBean;

public class CoordinatorLoginDAO
{
	private CoordinatorLoginBean clb = null;
	public CoordinatorLoginBean login(String rollNo)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM COORDINATORLOGIN01 WHERE ROLLNO=?");
			ps.setString(1, rollNo);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				clb = new CoordinatorLoginBean();
				clb.setName(rs.getString(1));
				clb.setRollno(rs.getString(2));
				clb.setSubjectTeach(rs.getString(3));
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return clb;
	}
}
