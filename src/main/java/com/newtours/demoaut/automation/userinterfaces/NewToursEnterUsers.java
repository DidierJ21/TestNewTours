package com.newtours.demoaut.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursEnterUsers
{
	public static final Target USER_OPTION= Target.the("Area User Option").located(By.name("userName"));
	public static final Target PASS_OPTION= Target.the("Area Pass Option").located(By.name("password"));
	public static final Target SUBMIT_BUTTON= Target.the("Submit button").located(By.name("login"));
}
