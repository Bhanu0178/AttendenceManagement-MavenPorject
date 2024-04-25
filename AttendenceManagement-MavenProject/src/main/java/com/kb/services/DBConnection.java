package com.kb.services;

import static com.kb.services.DBInfo.dbUrl;
import static com.kb.services.DBInfo.pWord;
import static com.kb.services.DBInfo.uName;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static Connection con = null;
	private DBConnection() {}
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dbUrl, uName, pWord);
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
