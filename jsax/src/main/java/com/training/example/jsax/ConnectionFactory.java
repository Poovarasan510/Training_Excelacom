package com.training.example.jsax;

import java.sql.*;
import java.util.ResourceBundle;
public class ConnectionFactory {
	
	public static Connection getOracleConnection()
	{
		Connection con=null;
		
		try
		{
		ResourceBundle labels=ResourceBundle.getBundle("application");
		
		con=DriverManager.getConnection(labels.getString("datasource.oracle.url"),
				labels.getString("datasource.oracle.username"),
				labels.getString("datasouce.orace.password"));
		
		System.out.println(con);
     
	}
	
	
	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	

	

}
