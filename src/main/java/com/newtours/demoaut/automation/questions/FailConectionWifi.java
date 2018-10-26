package com.newtours.demoaut.automation.questions;

import java.util.List;//Libreria para utilizar listas de java


import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;
import net.serenitybdd.screenplay.Actor;//Libreria para usar el actor
import net.serenitybdd.screenplay.Question;//Libreria para usar las questions
import net.serenitybdd.screenplay.questions.Text;//Libreria para retornar la respuesta de la question

public class FailConectionWifi implements Question<List<String>>//Implementa Questions para las validaciones
{
	@Override
	public List<String> answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(NewToursComponents.LINKCONTACT).viewedBy(actor).asList();
	}
	
	public static FailConectionWifi conection()
	{
		return new FailConectionWifi();
	}
}
