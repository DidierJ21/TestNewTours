package com.newtours.demoaut.automation.tasks;

import com.newtours.demoaut.automation.models.RegisterModel;//Utiliza Model
import com.newtours.demoaut.automation.userinterfaces.NewToursEnterRegister;//Utiliza UI de Enter register para mapeo

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;//Implementar el Task
import net.serenitybdd.screenplay.Tasks;//Para el instrumented
import net.serenitybdd.screenplay.actions.Enter;//Ingresar valores en el campo mapeaodo
import net.serenitybdd.screenplay.actions.SelectFromOptions;//Para Seleccionar item de un combobox country

public class RegisterOnNewTours  implements Task
{
private RegisterModel registermodel;
	
    public RegisterOnNewTours(RegisterModel DatesRegister) 
    {
    	this.registermodel=DatesRegister;
    }
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		//Ingresar valores al registro por medio del modelo y los mapeos del registro
		actor.attemptsTo(Enter.theValue(registermodel.getFirstname()).into(NewToursEnterRegister.FIRSTNAME_OPTION),
				Enter.theValue(registermodel.getLastname()).into(NewToursEnterRegister.LASTNAME_OPTION),
				Enter.theValue(registermodel.getPhone()).into(NewToursEnterRegister.PHONE_OPTION),
				Enter.theValue(registermodel.getEmail()).into(NewToursEnterRegister.EMAIL_OPTION),
				Enter.theValue(registermodel.getAddress()).into(NewToursEnterRegister.ADDRESS_OPTION),
				Enter.theValue(registermodel.getAddres2()).into(NewToursEnterRegister.ADDRESS2_OPTION),
				Enter.theValue(registermodel.getCity()).into(NewToursEnterRegister.CITY_OPTION),
				Enter.theValue(registermodel.getState()).into(NewToursEnterRegister.STATE_OPTION),
				Enter.theValue(registermodel.getPostalcode()).into(NewToursEnterRegister.POSTALCODE_OPTION),
				SelectFromOptions.byValue(registermodel.getCountry()).from(NewToursEnterRegister.COUNTRY_OPTION),
				Enter.theValue(registermodel.getUsername()).into(NewToursEnterRegister.USERNAME_OPTION),
				Enter.theValue(registermodel.getPassword()).into(NewToursEnterRegister.PASSWORD_OPTION),
				Enter.theValue(registermodel.getConfirmpassword()).into(NewToursEnterRegister.CONFIRMPASSWORD_OPTION));
		//Click.on(NewToursEnterRegister.REGISTER_BUTTON));
	}
	
	public static RegisterOnNewTours the(RegisterModel registermodel) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(RegisterOnNewTours.class,registermodel);
	}

}
