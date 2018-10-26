package com.newtours.demoaut.automation.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.demoaut.automation.exceptions.NoRegister;
import com.newtours.demoaut.automation.models.LoginModel;
import com.newtours.demoaut.automation.questions.UserNoRegister;
import com.newtours.demoaut.automation.tasks.GoTo;
import com.newtours.demoaut.automation.tasks.LoginNewToursClick;
import com.newtours.demoaut.automation.tasks.OpenTheBrowserNew;
import com.newtours.demoaut.automation.tasks.SingOnNewTours;
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

public class NewToursStepDefinitions

{
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
	private Actor nairobi =  Actor.named("Nairobi");//Definicion y bautizo al actor
	private NewToursHomePage newtoursHomePage;
	@Before
	public void setup()
	{
		nairobi.can(BrowseTheWeb.with(herBrowser));//Define el driver con que trabajara el actor
	}
	
	@Given("^Nairobi open the browser in the start session$")
	public void nairobiOpenTheBrowserInTheStartSession() throws Exception {
	   //Precondicion
		nairobi.wasAbleTo(OpenTheBrowserNew.on(newtoursHomePage),//Precondicion siempre con wasAbleTo
		GoTo.Login(NewToursComponents.NEWTOURSINGON));
	}
	
	
		@When("^She enters the username and the password$")
	public void sheEntersTheUsernameAndPassword(List<LoginModel> Credentials) {
	  //Condicion
		nairobi.attemptsTo(SingOnNewTours.the(Credentials.get(0)));//Condicion Siempre con attempsTo
	}

	@When("^She press the Submit button$")
	public void shePressTheSubmitButton() throws Exception {
	  //Condicion
		nairobi.attemptsTo(LoginNewToursClick.She());//Condicion Siempre con attempsTo
	}

	@Then("^She should enter (.*)$")
	public void sheShouldEnter(String Message) throws Exception {
	   //PostCondicion
		nairobi.should(seeThat(UserNoRegister.UserNoLogin(),hasItem("SIGN-OFF")).orComplainWith(NoRegister.class,NoRegister.NOREGISTER));
		//System.out.println(Message);
	}

}
