package net.practicadoschoucair.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			//plugin = {"pretty"},
			features="src/test/resources/features/trello/realizar_control_actividades.feature",
	        glue = {"net.practicadoschoucair.bdd.definition"}
			)
public class RunnerCargueDeArchivos {

}
