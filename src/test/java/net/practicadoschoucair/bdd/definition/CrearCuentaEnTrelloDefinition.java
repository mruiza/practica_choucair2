package net.practicadoschoucair.bdd.definition;

import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.practicadoschoucair.bdd.model.DatosControlActividadesModel;
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
	public void creoUnaCuentaNuevaEnTello(List<DatosControlActividadesModel> DatosControlActividadesModel) throws Throwable {
			formularioCreaTuCuentaSteps.diligenciar_formulario_crea_tucuenta(DatosControlActividadesModel);
	
	}

	@Then("^Verifico creación exitosa del usuario$")
	public void verificoCreaciónExitosaDelUsuario() throws Throwable {
		formularioCreaTuCuentaSteps.verificar_creacion_exitosa();
	}
}