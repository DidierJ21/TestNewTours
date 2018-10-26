package com.newtours.demoaut.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;//Buscar elementpos
import net.serenitybdd.screenplay.targets.Target;//Definir los target de los elementos mapeados

public class NewToursComponents
{
	public static final Target NEWTOURSINGON = Target.the("NewTours Sign-On").located(By.name("login"));
	public static final Target LINKCONTACT = Target.the("Link of contact principal page").located(By.linkText("CONTACT"));
	public static final Target SIGNOFF = Target.the("Radio button Flight Finder").located(By.linkText("SIGN-OFF"));
	public static final Target REGISTER = Target.the("NewTours Register").located(By.linkText("REGISTER"));
}
