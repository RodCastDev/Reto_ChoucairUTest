package co.com.choucair.certification.proyectoUtest.interactions;

import co.com.choucair.certification.proyectoUtest.userinterface.MainPageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnButton implements Interaction{

    public static ClickOnButton JoinToday() {
        return Tasks.instrumented(ClickOnButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPageUtest.BUTTON_JOINTODAY)
        );
    }
}
