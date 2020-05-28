package net.practicadoschoucair.bdd.steps;

import java.util.List;

import net.practicadoschoucair.bdd.pages.CrearTableroEnTrelloPages;
import net.thucydides.core.annotations.Step;

public class CrearTablerosEnTrelloSteps {

	CrearTableroEnTrelloPages crearTableroEnTrelloPages;
	
	@Step
	public void crear_tablero_en_trello(List<String> data) throws InterruptedException {
		crearTableroEnTrelloPages.click_crear_tablero_nuevo();
		crearTableroEnTrelloPages.ingresar_nombre_tablero(data.get(0).trim());
		crearTableroEnTrelloPages.click_crear_tablero();	
	}

	@Step
	public void verificar_creacion_tablero(List<String> data) {
		crearTableroEnTrelloPages.verificar_creacion_tablero(data.get(0).trim());
	}
}