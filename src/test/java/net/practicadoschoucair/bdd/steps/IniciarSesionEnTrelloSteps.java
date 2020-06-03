package net.practicadoschoucair.bdd.steps;

import java.util.List;
import net.practicadoschoucair.bdd.pages.IniciarSesionEnTrelloPages;
import net.thucydides.core.annotations.Step;

public class IniciarSesionEnTrelloSteps {

IniciarSesionEnTrelloPages iniciarSesionEnTrelloPages;
	
	@Step
	public void ingresar_datos_inicio_sesion(List<String> data) {
		iniciarSesionEnTrelloPages.open();
		iniciarSesionEnTrelloPages.ingresar_email(data.get(0).trim());
		iniciarSesionEnTrelloPages.ingresar_contrasena(data.get(1).trim());
		iniciarSesionEnTrelloPages.click_iniciar_sesion();
	}

	public void verificar_inicio_sesion() {
		iniciarSesionEnTrelloPages.verificar_inicio_sesion();
	}
}