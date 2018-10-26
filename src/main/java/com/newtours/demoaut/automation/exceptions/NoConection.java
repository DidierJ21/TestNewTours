package com.newtours.demoaut.automation.exceptions;

public class NoConection extends AssertionError
{
   public static final String NOCONNECTION="No connection to internet";//Mensaje para la conexion a internet
   
   public NoConection (String message,Throwable cause) //Metodo de la exepcion que recibe parametros para el mensaje de error
   {
	   super(message,cause);
   }
}
