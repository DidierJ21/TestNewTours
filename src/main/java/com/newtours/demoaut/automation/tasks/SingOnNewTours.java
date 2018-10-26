package com.newtours.demoaut.automation.tasks;

import com.newtours.demoaut.automation.models.LoginModel;
import com.newtours.demoaut.automation.userinterfaces.NewToursEnterUsers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SingOnNewTours implements Task
{
	private LoginModel loginModel;
	
    public SingOnNewTours(LoginModel Credentials) 
    {
    	this.loginModel=Credentials;
    }
    
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(Enter.theValue(loginModel.getUser()).into(NewToursEnterUsers.USER_OPTION),
				Enter.theValue(loginModel.getPassword()).into(NewToursEnterUsers.PASS_OPTION));
//		actor.attemptsTo(Enter.theValue(User).into(NewToursEnterUsers.USER_OPTION),
//				Enter.theValue(Password).into(NewToursEnterUsers.PASS_OPTION));
//				//Click.on(NewToursEnterUsers.SUBMIT_BUTTON));
	}

		public static SingOnNewTours the(LoginModel loginModel) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SingOnNewTours.class,loginModel);
	}


}
