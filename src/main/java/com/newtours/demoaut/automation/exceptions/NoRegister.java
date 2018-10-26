package com.newtours.demoaut.automation.exceptions;

public class NoRegister extends AssertionError//Hereda de la clase AssertionError
{
	public static final String NOREGISTER="User no register in the aplication please complete the register";//Mensaje para validar usuario registrado
	   
	   public NoRegister (String message,Throwable cause) 
	   {
		   super(message,cause);
	   }

}


