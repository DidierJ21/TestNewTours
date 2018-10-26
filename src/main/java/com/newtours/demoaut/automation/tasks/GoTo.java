package com.newtours.demoaut.automation.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;

import net.serenitybdd.screenplay.Actor;//Utilizar la clase Actor
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;//Libreria para ejecutar el .click
import net.serenitybdd.screenplay.targets.Target;//Para utilizar los target

public class GoTo implements Task
{

	private Target newtoursSing;
	
	
	public GoTo(Target newtoursSing) 
	{
		this.newtoursSing=newtoursSing;//Constructor
    } 
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(NewToursComponents.NEWTOURSINGON),//Click al componente especifico por medio del actor
				Click.on(newtoursSing));	
	}
	public static GoTo Login(Target newtoursSing) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class,newtoursSing);
	}
	
}
