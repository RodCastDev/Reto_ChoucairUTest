package co.com.choucair.certification.proyectoUtest.tasks;

import co.com.choucair.certification.proyectoUtest.interactions.ClickContinue;
import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import co.com.choucair.certification.proyectoUtest.userinterface.FormAddressView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class StepTwoFillOut implements Task {

    private final String strCity;
    private final String strZip;
    private final String strCountry;

    public StepTwoFillOut(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    public static StepTwoFillOut Location(String strCity, String strZip, String strCountry){
        return Tasks.instrumented(StepTwoFillOut.class, strCity, strZip, strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                Click.on(FormAddressView.DELETE_BTN),
//                Enter.theValue(strCity).into(FormAddressView.CITY_FIELD),
//                Hit.the(Keys.ARROW_DOWN).into(FormAddressView.CITY_FIELD),
//                Hit.the(Keys.ENTER).into(FormAddressView.CITY_FIELD),

                Clear.field(FormAddressView.ZIP_FIELD),
                Enter.theValue(strZip).into(FormAddressView.ZIP_FIELD),

                Click.on(FormAddressView.COUNTRY_FIELD),
                Enter.theValue(strCountry).into(FormAddressView.COUNTRY_FIELD_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(FormAddressView.COUNTRY_FIELD_TEXT),
                Hit.the(Keys.ENTER).into(FormAddressView.COUNTRY_FIELD_TEXT),

                ClickContinue.ContinueBtn()
        );
    }
}
