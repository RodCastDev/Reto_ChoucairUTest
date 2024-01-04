package co.com.choucair.certification.proyectoUtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/JoinToday.feature",
        tags = "@Test",
        glue ="co.com.choucair.certification.proyectoUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
