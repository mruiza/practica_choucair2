package net.practicadoschoucair.bdd.steps;

import java.util.List;

import net.practicadoschoucair.bdd.pages.FormularioCreaTuCuentaPages;
import net.thucydides.core.annotations.Step;

public class FormularioCreaTuCuentaSteps {
	FormularioCreaTuCuentaPages formularioCreaTuCuentaPages;

	@Step
	public void irAUrlTrello() {
		formularioCreaTuCuentaPages.open();
	}
	
	@Step
	public void verificar_creacion_exitosa() {
		formularioCreaTuCuentaPages.verificar_creacion_exitosa();
	}

	@Step
	public void diligenciar_formulario_crea_tucuenta(List<List<String>> data, int i) throws InterruptedException {
		 formularioCreaTuCuentaPages.ingresar_email(data.get(i).get(0).trim());
		  formularioCreaTuCuentaPages.dar_clic_boton_continuar();
		  formularioCreaTuCuentaPages.ingresar_nombre(data.get(i).get(1).trim());
		  formularioCreaTuCuentaPages.ingresar_contrasena(data.get(i).get(2).trim());
		  formularioCreaTuCuentaPages.dar_clic_boton_continuar();
	}
}
