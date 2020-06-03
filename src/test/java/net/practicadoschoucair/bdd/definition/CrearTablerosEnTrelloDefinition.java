package net.practicadoschoucair.bdd.definition;

import java.util.List;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.practicadoschoucair.bdd.model.DatosControlActividadesModel;
import net.practicadoschoucair.bdd.steps.CrearTablerosEnTrelloSteps;
import net.thucydides.core.annotations.Steps;

public class CrearTablerosEnTrelloDefinition {
	
	@Steps
	CrearTablerosEnTrelloSteps crearTablerosEnTrelloDefinitionSteps;
	
	
	@When("^Creo el tablero$")
	public void creoElTablero(List<String> data) throws Throwable {
		crearTablerosEnTrelloDefinitionSteps.crear_tablero_en_trello(data);
	}

	@Then("^Verifico creación exitosa del tablero$")
	public void verificoCreaciónExitosaDelTablero(List<String> data) throws Throwable {
		crearTablerosEnTrelloDefinitionSteps.verificar_creacion_tablero(data);
	}
}