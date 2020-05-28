package net.practicadoschoucair.bdd.definition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.practicadoschoucair.bdd.steps.FormularioCreaTuCuentaSteps;
import net.thucydides.core.annotations.Steps;

public class CrearCuentaEnTrelloDefinition {
	
	@Steps
	FormularioCreaTuCuentaSteps formularioCreaTuCuentaSteps;
	
	@Given("^Ingreso a la pagina web de Trello$")
	public void ingresoALaPaginaWebDeTrello() throws Throwable {
		formularioCreaTuCuentaSteps.irAUrlTrello();
	}
	
	@When("^Creo una cuenta nueva en Trello$")
	public void creoUnaCuentaNuevaEnTello(DataTable dtaTable) throws Throwable {
		List<List<String>> data = dtaTable.raw();
		for (int i=1; i<data.size(); i++) {
			formularioCreaTuCuentaSteps.diligenciar_formulario_crea_tucuenta(data,i);
		}
	}

	@Then("^Verifico creación exitosa del usuario$")
	public void verificoCreaciónExitosaDelUsuario() throws Throwable {
		formularioCreaTuCuentaSteps.verificar_creacion_exitosa();
	}
}