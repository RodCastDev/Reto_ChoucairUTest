package co.com.choucair.certification.proyectoUtest.interactions;

import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickContinue implements Interaction {

    public static ClickContinue ContinueBtn() {
        return Tasks.instrumented(ClickContinue.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormAbutMeView.NEXT_LOCATION_BTN)
        );
    }
}
