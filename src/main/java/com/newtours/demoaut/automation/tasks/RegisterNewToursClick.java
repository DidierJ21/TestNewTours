package com.newtours.demoaut.automation.tasks;

import com.newtours.demoaut.automation.userinterfaces.NewToursEnterRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegisterNewToursClick implements Task  
{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(NewToursEnterRegister.REGISTER_BUTTON));//Dar click en el componente mapeado
		
		}

			public static RegisterNewToursClick She() 
			{
				// TODO Auto-generated method stub
				return Tasks.instrumented(RegisterNewToursClick.class);
			}
}
