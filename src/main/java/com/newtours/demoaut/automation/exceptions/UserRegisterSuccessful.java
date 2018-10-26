package com.newtours.demoaut.automation.exceptions;

public class UserRegisterSuccessful extends AssertionError
{
	public static final String REGISTERSUC="User no register in the aplication please repeat the steps";//Mensaje para validar usuario registrado
	   
	   public UserRegisterSuccessful (String message,Throwable cause) 
	   {
		   super(message,cause);
	   }
}
