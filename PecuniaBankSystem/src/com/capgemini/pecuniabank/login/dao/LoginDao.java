package com.capgemini.pecuniabank.login.dao;

public interface LoginDao 
{
	public void openConnection();
	public void closeConnection();
	public boolean validateUsers(String name, String password);
}
