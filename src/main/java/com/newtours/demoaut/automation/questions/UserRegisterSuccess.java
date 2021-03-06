package com.newtours.demoaut.automation.questions;

import java.util.List;

import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UserRegisterSuccess implements Question<List<String>> 
{

	@Override
	public List<String> answeredBy(Actor actor)
	{
		// TODO Auto-generated method stub
		return Text.of(NewToursComponents.SIGNOFF).viewedBy(actor).asList();
		
	}
	public static UserRegisterSuccess UserRegisterSu()
	{
		return new UserRegisterSuccess();
	}

}
