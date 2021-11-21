package com.crm.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



public class DataBaseUtility {
	static Driver driver;
	static ResultSet result;
	static Connection connection;
	static int result1;

	public void connectDB()
	{
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public ResultSet executeResult(String query)
	{
		try {
		result=connection.createStatement().executeQuery(query);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public int executeUpadate(String query1)
	{
		try {
			result1=connection.createStatement().executeUpdate(query1);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result1;	
	}
	 
	public void closeDB() throws SQLException {
		connection.close();
	}
}
