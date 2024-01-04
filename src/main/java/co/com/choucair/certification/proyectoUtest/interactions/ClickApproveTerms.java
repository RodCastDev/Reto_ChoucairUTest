package co.com.choucair.certification.proyectoUtest.interactions;


import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import co.com.choucair.certification.proyectoUtest.userinterface.FormPassView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickApproveTerms implements Interaction {
    public static ClickApproveTerms ClickCheckbox() {
        return Tasks.instrumented(ClickApproveTerms.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormPassView.TERMS_CHECKBOX),
                Click.on(FormPassView.PRIVACY_CHECKBOX)
        );
    }
}
