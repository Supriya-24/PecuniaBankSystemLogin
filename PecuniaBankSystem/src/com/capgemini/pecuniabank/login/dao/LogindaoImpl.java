package com.capgemini.pecuniabank.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogindaoImpl implements LoginDao
{
	private Connection connection = null;
	private PreparedStatement pst;
	@Override
	public void openConnection() 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@Localhost:1521:xe";
			connection = DriverManager.getConnection(url,"scott","tiger");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void closeConnection() 
	{
		try
		{
			connection.close();
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	 public boolean validateUsers(String name, String pass)
		{
			openConnection();
			try 
			{
				pst = connection.prepareStatement("select * from users where username=? and password =? ");
				pst.setString(1, name);
				pst.setString(2, pass);
				if(pst.executeQuery().next())
					return true;
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				closeConnection();
			}
			return false;

		}
}