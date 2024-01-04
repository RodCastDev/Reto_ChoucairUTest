package co.com.choucair.certification.proyectoUtest.tasks;

import co.com.choucair.certification.proyectoUtest.userinterface.MainPageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.aspectj.apache.bcel.classfile.Module;

public class OpenPage implements Task {
    private MainPageUtest mainPageUtest;
    public static OpenPage UTest() {
        return Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(mainPageUtest)
        );
    }
}
