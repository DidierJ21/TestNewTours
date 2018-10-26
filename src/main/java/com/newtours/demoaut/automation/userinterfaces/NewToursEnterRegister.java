package com.newtours.demoaut.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursEnterRegister 
{
	public static final Target FIRSTNAME_OPTION= Target.the("Area Firstname Option").located(By.name("firstName"));
	public static final Target LASTNAME_OPTION= Target.the("Area LastName Option").located(By.name("lastName"));
	public static final Target 	PHONE_OPTION= Target.the("Area Phone Option").located(By.name("phone"));
	public static final Target EMAIL_OPTION= Target.the("Area Email Option").located(By.name("userName"));
	public static final Target ADDRESS_OPTION= Target.the("Area Address Option").located(By.name("address1"));
	public static final Target ADDRESS2_OPTION= Target.the("Area Address2 Option").located(By.name("address2"));
	public static final Target CITY_OPTION= Target.the("Area City Option").located(By.name("city"));
	public static final Target STATE_OPTION= Target.the("Area State Option").located(By.name("state"));
	public static final Target POSTALCODE_OPTION= Target.the("Area PostalCode Option").located(By.name("postalCode"));
	public static final Target COUNTRY_OPTION= Target.the("Area Country Option").located(By.name("country"));
	public static final Target USERNAME_OPTION= Target.the("Area Username option").located(By.name("email"));
	public static final Target PASSWORD_OPTION= Target.the("Area Password Option").located(By.name("password"));
	public static final Target CONFIRMPASSWORD_OPTION= Target.the("Area ConfirmPass Option").located(By.name("confirmPassword"));
	public static final Target REGISTER_BUTTON= Target.the("Submit Register button").located(By.name("register"));
}
