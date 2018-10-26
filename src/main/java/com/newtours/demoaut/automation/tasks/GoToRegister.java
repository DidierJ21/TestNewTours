package com.newtours.demoaut.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;//Libreria utilizada para devolver valores de la clase task

import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToRegister  implements Task {
	private Target newtoursregister;
	
	public GoToRegister(Target newtoursregister) 
	{
		this.newtoursregister=newtoursregister;
    } 
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(NewToursComponents.REGISTER),//Accion de dar click al componente especifico mapeado
				Click.on(newtoursregister));
		
	}
	public static GoTo Register(Target newtoursregister) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class,newtoursregister);
	}
}
