package com.newtours.demoaut.automation.tasks;

import com.newtours.demoaut.automation.userinterfaces.NewToursEnterUsers;//Utiliza la clase 

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LoginNewToursClick implements Task 
{

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(NewToursEnterUsers.SUBMIT_BUTTON));//Click sobre el elemento mapeado en la clase especifica
					
	}

		public static LoginNewToursClick She() 
		{
			// TODO Auto-generated method stub
			return Tasks.instrumented(LoginNewToursClick.class);
		}

		
}

