package com.newtours.demoaut.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;//Utilizar etiqueta cucumber options para feature y stepsdef
import cucumber.api.SnippetType;//Dar formato a los metodos generados en el feature
import net.serenitybdd.cucumber.CucumberWithSerenity;//Utiliza cucumber con serenitty para el run

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
		(
		   features="src/test/resources/features",//Ruta del feature
		   tags="@Register,@Login",//Etiquetas para que corra los dos fetures
		   
		   glue="com.newtours.demoaut.automation.stepdefinitions",// Match con los steps
		   snippets=SnippetType.CAMELCASE//Formato camelcase a los metodos del feature
    	)
public class NewToursRunner{}
