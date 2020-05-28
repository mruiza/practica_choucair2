package net.practicadoschoucair.bdd.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/login")
public class IniciarSesionEnTrelloPages extends PageObject{

	@FindBy(id = "user")
	private WebElementFacade txtUser;
	
	@FindBy(id = "password")
	private WebElementFacade txtContrasena;
	
	@FindBy(id = "login")
	private WebElementFacade btnIniciarSesion;
	
	@FindBy(xpath = "//h3[text()='Tableros personales']")
	private WebElementFacade lblTableroPersonal;

	
	public void ingresar_email(String email) {
		txtUser.clear();
		txtUser.sendKeys(email);		
	}

	public void ingresar_contrasena(String contrasena) {
		txtContrasena.clear();
		txtContrasena.sendKeys(contrasena);
	}

	public void click_iniciar_sesion() {
		btnIniciarSesion.click();
	}

	public void verificar_inicio_sesion() {
		String mensaje = "Tableros personales";
		assertThat(lblTableroPersonal.getText(), containsString(mensaje));
	}
}