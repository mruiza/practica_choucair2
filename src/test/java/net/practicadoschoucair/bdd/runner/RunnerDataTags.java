package net.practicadoschoucair.bdd.runner;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.practicadoschoucair.bdd.utilities.BeforeSuite;
import net.practicadoschoucair.bdd.utilities.DataToFeature;

@CucumberOptions (features = "src/test/resources/features/trello/realizar_control_actividades.feature", tags = "@Trello", snippets= SnippetType.CAMELCASE,
                 glue = {"net.practicadoschoucair.bdd.definition"})
@RunWith(RunnerPersonalizado.class)
public class RunnerDataTags{
	 @BeforeSuite
	 public static void test() throws InvalidFormatException, IOException {
	      DataToFeature.overrideFeatureFiles("src/test/resources/features/trello/realizar_control_actividades.feature");
	  }
}