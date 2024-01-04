package co.com.choucair.certification.proyectoUtest.tasks;

import co.com.choucair.certification.proyectoUtest.interactions.ClickContinue;
import co.com.choucair.certification.proyectoUtest.userinterface.FormDevicesView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class StepThirdFillOut implements Task {

    private final String strComputer;
    private final String strVersion;
    private final String strLanguage;
    private final String strBrand;
    private final String strModel;
    private final String strSystem;

    public StepThirdFillOut(String strComputer, String strVersion, String strLanguage, String strBrand, String strModel, String strSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strBrand = strBrand;
        this.strModel = strModel;
        this.strSystem = strSystem;
    }

    public static StepThirdFillOut AboutDevices(String strComputer, String strVersion, String strLanguage, String strBrand, String strModel, String strSystem) {
        return Tasks.instrumented(StepThirdFillOut.class, strComputer, strVersion, strLanguage, strBrand, strModel, strSystem);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormDevicesView.COMPUTER_FIELD),
                Enter.theValue(strComputer).into(FormDevicesView.COMPUTER_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.COMPUTER_INPUT),

                Click.on(FormDevicesView.VERSION_FIELD),
                Enter.theValue(strVersion).into(FormDevicesView.VERSION_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.VERSION_INPUT),

                Click.on(FormDevicesView.LANGUAGE_FIELD),
                Enter.theValue(strLanguage).into(FormDevicesView.LANGUAGE_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.LANGUAGE_INPUT),

                Click.on(FormDevicesView.BRAND_FIELD),
                Enter.theValue(strBrand).into(FormDevicesView.BRAND_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.BRAND_INPUT),

                Click.on(FormDevicesView.MODEL_FIELD),
                Enter.theValue(strModel).into(FormDevicesView.MODEL_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.MODEL_INPUT),

                Click.on(FormDevicesView.SYSTEM_FIELD),
                Enter.theValue(strSystem).into(FormDevicesView.SYSTEM_INPUT),
                Hit.the(Keys.ENTER).into(FormDevicesView.SYSTEM_INPUT),

                ClickContinue.ContinueBtn()

        );
    }
}
