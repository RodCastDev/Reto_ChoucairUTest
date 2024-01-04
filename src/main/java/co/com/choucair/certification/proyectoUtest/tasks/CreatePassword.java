package co.com.choucair.certification.proyectoUtest.tasks;

import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import co.com.choucair.certification.proyectoUtest.userinterface.FormPassView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreatePassword implements Task {
    private final String strPassword;

    public CreatePassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public static CreatePassword Password(String strPassword) {
        return Tasks.instrumented(CreatePassword.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormPassView.PASSWORD_INPUT),
                Enter.theValue(strPassword).into(FormPassView.PASSWORD_INPUT),
                Click.on(FormPassView.CONFIRM_PASSWORD_INPUT),
                Enter.theValue(strPassword).into(FormPassView.CONFIRM_PASSWORD_INPUT)
        );
    }
}
