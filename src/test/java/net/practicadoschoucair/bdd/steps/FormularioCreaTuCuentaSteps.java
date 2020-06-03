package net.practicadoschoucair.bdd.steps;

import java.util.List;

import net.practicadoschoucair.bdd.model.DatosControlActividadesModel;
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
	public void diligenciar_formulario_crea_tucuenta(List<DatosControlActividadesModel> DatosControlActividadesModel) throws InterruptedException {
		 formularioCreaTuCuentaPages.ingresar_email(DatosControlActividadesModel.get(0).getEmail());
		  formularioCreaTuCuentaPages.dar_clic_boton_continuar();
		  formularioCreaTuCuentaPages.ingresar_nombre(DatosControlActividadesModel.get(0).getNombre());
		  formularioCreaTuCuentaPages.ingresar_contrasena(DatosControlActividadesModel.get(0).getContrasena());
		  formularioCreaTuCuentaPages.dar_clic_boton_continuar();
	}
}
