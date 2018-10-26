package com.newtours.demoaut.automation.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;//Utilizar listas de java

import org.openqa.selenium.WebDriver;//Driver Selenium

import com.newtours.demoaut.automation.exceptions.NoRegister;
import com.newtours.demoaut.automation.exceptions.UserRegisterSuccessful;
import com.newtours.demoaut.automation.models.RegisterModel;
import com.newtours.demoaut.automation.questions.UserNoRegister;
import com.newtours.demoaut.automation.questions.UserRegisterSuccess;
import com.newtours.demoaut.automation.tasks.GoToRegister;
import com.newtours.demoaut.automation.tasks.OpenTheBrowserNew;
import com.newtours.demoaut.automation.tasks.RegisterNewToursClick;
import com.newtours.demoaut.automation.tasks.RegisterOnNewTours;
import com.newtours.demoaut.automation.userinterfaces.NewToursComponents;
import com.newtours.demoaut.automation.userinterfaces.NewToursHomePage;
//Utiliza otras clases del proyecto
import cucumber.api.java.Before;//Utilizar etiqueta before para ejecuciones antes de 
import cucumber.api.java.en.Given;//Dado q
import cucumber.api.java.en.Then;//Entonces
import cucumber.api.java.en.When;//Cuando
import net.serenitybdd.screenplay.Actor;//Actor
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;//Navegador
import net.thucydides.core.annotations.Managed;//Manejar driver 

public class NewToursRegisterStepDefinitions 
{
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor nairobi =  Actor.named("Nairobi");//Definicion y bautizo al actor
	private NewToursHomePage newtoursHomePage;
	@Before
	public void setup()
	{
		nairobi.can(BrowseTheWeb.with(herBrowser));//Define el driver con que trabajara el actor
	}
	@Given("^Nairobi open the browser in the register session$")
	public void nairobiOpenTheBrowserInTheRegisterSession() throws Exception
	{
		   //Precondicion PAsado
				nairobi.wasAbleTo(OpenTheBrowserNew.on(newtoursHomePage),//Precondicion siempre con wasAbleTo
				GoToRegister.Register(NewToursComponents.REGISTER)); 
	}

	@When("^She enters the dates for the register$")
	public void sheEntersTheDatesForTheRegister(List<RegisterModel> DatesRegister) {
		//Condicion Presente
		nairobi.attemptsTo(RegisterOnNewTours.the(DatesRegister.get(0)));//Condicion Siempre con attempsTo
	}

	@When("^She should press the Submit Button.$")
	public void sheShouldPressTheSubmitButton() throws Exception
	{
		nairobi.attemptsTo(RegisterNewToursClick.She());//Condicion Siempre con attempsTo
	}

	@Then("^she should be registered$")
	public void sheShouldBeRegistered() throws Exception
	{
	  //PostCondicion
	  nairobi.should(seeThat(UserRegisterSuccess.UserRegisterSu(),hasItem("SIGN-OFF")).orComplainWith(UserRegisterSuccessful.class,UserRegisterSuccessful.REGISTERSUC));
      System.out.println("Usuario Registrado Con Exito");
	}
}
