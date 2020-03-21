package com.capgemini.pecuniabank.login.util;
@SuppressWarnings("serial")
public class LoginInvalidException extends Exception{
   public LoginInvalidException()
   {
	   super("Invalid User");
   }
}
