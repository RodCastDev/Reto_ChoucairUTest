package co.com.choucair.certification.proyectoUtest.stepdefinitions;

import co.com.choucair.certification.proyectoUtest.interactions.ClickApproveTerms;
import co.com.choucair.certification.proyectoUtest.interactions.ClickContinue;
import co.com.choucair.certification.proyectoUtest.interactions.ClickOnButton;
import co.com.choucair.certification.proyectoUtest.model.UTestData;
import co.com.choucair.certification.proyectoUtest.questions.Answer;
import co.com.choucair.certification.proyectoUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UTestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^i go to the UTest site$")
    public void iAmOnTheUTestSite() {
        OnStage.theActorCalled("User").wasAbleTo(
                OpenPage.UTest()
        );
    }

    @Given("^select Join Today$")
    public void selectJoinToday() {
        theActorInTheSpotlight().attemptsTo(
                ClickOnButton.JoinToday()
        );
    }

    @When("^fill out the form about me$")
    public void fillInTheFormAboutMe(List<UTestData> uTestDataList) {
        UTestData uTestData = uTestDataList.get(0);
        theActorInTheSpotlight().attemptsTo(
                StepOneFillOut.AboutMe(uTestData.getName(), uTestData.getLastName(), uTestData.getEmail(), uTestData.getMonth(), uTestData.getDay(), uTestData.getYear())
        );
    }

    @And("^fill out the form about my address$")
    public void fillInTheFormAbouLocation(List<UTestData> uTestDataList) {
        UTestData uTestData = uTestDataList.get(0);
        theActorInTheSpotlight().attemptsTo(
                StepTwoFillOut.Location(uTestData.getCity(), uTestData.getZip(), uTestData.getCountry())
        );
    }

    @And("^fill out the form about my devices$")
    public void fillInTheFormAbouDevices(List<UTestData> uTestData) {
        theActorInTheSpotlight().attemptsTo(
                StepThirdFillOut.AboutDevices(uTestData.get(0).getComputer(), uTestData.get(0).getVersion(), uTestData.get(0).getLanguage(), uTestData.get(0).getBrand(), uTestData.get(0).getModel(), uTestData.get(0).getSystem())

        );
    }

    @And("^complete the form with a new password$")
    public void createPassword(List<UTestData> uTestData) {
        theActorInTheSpotlight().attemptsTo(
                CreatePassword.Password(uTestData.get(0).getPassword()),ClickApproveTerms.ClickCheckbox(), ClickContinue.ContinueBtn()
        );
    }
    @Then("^validate the successful creation of the account with the (.*)$")
    public void vaidateTitle(String tituloPage) {
        theActorInTheSpotlight().should(
                seeThat(Answer.toThe(tituloPage))
        );
    }
}
