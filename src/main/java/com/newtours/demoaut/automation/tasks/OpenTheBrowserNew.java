package com.newtours.demoaut.automation.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;//Utilizada para que el actor pueda ver elementos en la pag
import static net.serenitybdd.screenplay.Tasks.instrumented;//Propia de las tareas para devolver valores 
import static org.hamcrest.CoreMatchers.hasItem;//Para validar la conexion hace referencia al Item de componente mapeado

import com.newtours.demoaut.automation.exceptions.NoConection;//Clase exception 
import com.newtours.demoaut.automation.questions.FailConectionWifi;//Clase question

import net.serenitybdd.core.pages.PageObject;//Utilizar la clase propia PageObject serenity
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;//Para abrir navegador
import net.thucydides.core.annotations.Step;//Anotacion Step para especificar el paso

public class OpenTheBrowserNew implements Task {
		   private PageObject page;
		   public OpenTheBrowserNew(PageObject page)//Constructor
		   {
			   this.page=page;//Instanciar 
		   }
			@Override
			@Step ("{0} open the browser on New Tours Home Page")//Definicion del Step {0}= nombre del actor
			public <T extends Actor> void performAs(T actor) {
				// TODO Auto-generated method stub aqui  van todas las acciones para cumplir con dicha tarea
				actor.attemptsTo(Open.browserOn(page));//Abre el navegador en la pagina especificada en la Page ObjectHome
				page.getDriver().manage().window().maximize();//Maximiza el navegador
				actor.should(seeThat(FailConectionWifi.conection(),hasItem("CONTACT")).orComplainWith(NoConection.class,NoConection.NOCONNECTION));
			//Accion para validar conexion
			}
			public static OpenTheBrowserNew on(PageObject page) {//Metodo on para retornar lo echo ppr la tarea
				// TODO Auto-generated method stub
				//return new OpenTheBrowser();
				return instrumented(OpenTheBrowserNew.class,page);
				//Instrumented port debsjo llama el condtructor de la clase que se ajuste a los parametros
				//return new openthebrowser(page)
			}

}
