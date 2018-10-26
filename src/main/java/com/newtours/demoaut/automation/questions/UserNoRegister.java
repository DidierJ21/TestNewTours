package com.newtours.demoaut.automation.questions;

import java.util.List;

import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UserNoRegister implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor)
	{
		// TODO Auto-generated method stub
		return Text.of(NewToursComponents.SIGNOFF).viewedBy(actor).asList();//Retorna si el elemento es visible o no
	}
	public static UserNoRegister UserNoLogin()
	{
		return new UserNoRegister();
	}
}
