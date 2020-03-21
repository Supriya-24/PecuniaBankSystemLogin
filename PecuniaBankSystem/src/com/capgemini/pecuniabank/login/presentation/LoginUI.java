package com.capgemini.pecuniabank.login.presentation;
import java.util.Scanner;

import com.capgemini.pecuniabank.login.servicelayer.LoginService;
import com.capgemini.pecuniabank.login.servicelayer.LoginServiceImpl;
import com.capgemini.pecuniabank.login.util.LoginInvalidException;
public class LoginUI 
{
		@SuppressWarnings("resource")
		public static void main(String[] args) 
		{
			LoginService service = new LoginServiceImpl();
			Scanner sc = new Scanner(System.in);
			System.out.println("User Name : ");
			String name = sc.nextLine();
			System.out.println("Password : ");
			String pass = sc.nextLine(); 
			try
			{
			boolean login = service.validateUsers(name,pass);
			if(login)
			{
				System.out.println("You have logged in succesfully");
				throw new LoginInvalidException();
			}
			else
			{
				System.out.println("Invalid User ");
				
			}
		    }catch(LoginInvalidException e)
			{
				e.getMessage();
			}
		}	
}


