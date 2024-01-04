package co.com.choucair.certification.proyectoUtest.tasks;

import co.com.choucair.certification.proyectoUtest.interactions.ClickContinue;
import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepOneFillOut implements Task {

    private final String strName;
    private final String strLastName;
    private final String strEmail;
    private final String strMonth;
    private final String strDay;
    private final String strYear;

    public StepOneFillOut(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }
    public static StepOneFillOut AboutMe(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear ){
        return Tasks.instrumented(StepOneFillOut.class,strName,strLastName,strEmail,strMonth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(FormAbutMeView.FIRST_NAME_INPUT),
                Enter.theValue(strLastName).into(FormAbutMeView.LAST_NAME_INPUT),
                Enter.theValue(strEmail).into(FormAbutMeView.EMAILD_INPUT),
                SelectFromOptions.byVisibleText(strMonth).from(FormAbutMeView.MONTH_FIELD),
                SelectFromOptions.byVisibleText(strDay).from(FormAbutMeView.DAY_FIELD),
                SelectFromOptions.byVisibleText(strYear).from(FormAbutMeView.YEAR_FIELD),
                ClickContinue.ContinueBtn()
        );

    }
}

