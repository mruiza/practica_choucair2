package net.practicadoschoucair.bdd.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/es/signup")
public class FormularioCreaTuCuentaPages extends PageObject {

	@FindBy(id = "email")
	private WebElementFacade txtEmail;
	
	@FindBy(id = "signup-submit")
	private WebElementFacade btnContinuar;
	
	@FindBy(xpath = "//h5[text()='Regístrate para obtener tu cuenta']//following::input[2]")
	private WebElementFacade txtNombre;
	
	@FindBy(xpath = "//h5[text()='Regístrate para obtener tu cuenta']//following::input[3]")
	private WebElementFacade txtContrasena;
	
	@FindBy(xpath = "//span[text()='¡Bienvenido a Trello!']")
	private WebElementFacade lblBienvenida;
	
	@FindBy(xpath = "//form[@id='signup']")
	private WebElementFacade frmInicio;
	
	
	
	public void ingresar_email(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);	
	}

	public void dar_clic_boton_continuar() throws InterruptedException {
		btnContinuar.click();	
		Thread.sleep(30000);
	}

	public void ingresar_nombre(String nombre) {
		txtNombre.clear();
		txtNombre.sendKeys(nombre);
	}

	public void ingresar_contrasena(String contrasena) {
		txtContrasena.clear();
		txtContrasena.sendKeys(contrasena);
	}

	public void verificar_creacion_exitosa() {
		String mensaje = "¡Bienvenido a Trello!";
		assertThat(lblBienvenida.getText(), containsString(mensaje));
	}
}