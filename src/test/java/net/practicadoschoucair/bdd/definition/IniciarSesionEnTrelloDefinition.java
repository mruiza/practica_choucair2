package net.practicadoschoucair.bdd.definition;

import java.util.List;

import cucumber.api.java.en.Given;
import net.practicadoschoucair.bdd.steps.IniciarSesionEnTrelloSteps;
import net.thucydides.core.annotations.Steps;

public class IniciarSesionEnTrelloDefinition {
	
	@Steps
	IniciarSesionEnTrelloSteps iniciarSesionEnTrelloSteps;
	
	@Given("^Autenticacion en trello$")
	public void autenticacionEnTrello(List<String> data) throws Throwable {
		iniciarSesionEnTrelloSteps.ingresar_datos_inicio_sesion(data);
		iniciarSesionEnTrelloSteps.verificar_inicio_sesion();
	}
}