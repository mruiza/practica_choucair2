package net.practicadoschoucair.bdd.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearTableroEnTrelloPages extends PageObject{

	@FindBy(xpath = "//div[@class='board-tile mod-add']")
	private WebElementFacade btnNuevoTablero;
	
	@FindBy(xpath = "//input[@class='subtle-input']")
	private WebElementFacade txtTituloTablero;
	
	@FindBy(xpath = "//button[@class='button primary']")
	private WebElementFacade btnCrearTablero;
	
	@FindBy(xpath = "//span[contains(@class,'js-board-editing-target')]")
	private WebElementFacade lblNombreTablero; 
	
		
	public void click_crear_tablero_nuevo() {
		btnNuevoTablero.click();
	}

	public void ingresar_nombre_tablero(String nombre) {
		txtTituloTablero.clear();
		txtTituloTablero.sendKeys(nombre);
	}

	public void click_crear_tablero() throws InterruptedException {
		btnCrearTablero.click();
		Thread.sleep(5000);
	}

	public void verificar_creacion_tablero(String nombreTablero) {
		assertThat(lblNombreTablero.getText(), containsString(nombreTablero));
	}
}