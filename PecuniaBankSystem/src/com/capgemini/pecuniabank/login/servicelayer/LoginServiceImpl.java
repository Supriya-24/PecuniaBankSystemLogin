package com.capgemini.pecuniabank.login.servicelayer;
import com.capgemini.pecuniabank.login.dao.LoginDao;
import com.capgemini.pecuniabank.login.dao.LogindaoImpl;
public class LoginServiceImpl implements LoginService
{
	LoginDao d = new LogindaoImpl();
	@Override
	public boolean validateUsers(String name, String pass) {
		return d.validateUsers(name, pass);
	}
}
