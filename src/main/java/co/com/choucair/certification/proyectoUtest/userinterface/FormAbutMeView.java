package co.com.choucair.certification.proyectoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormAbutMeView extends PageObject {
    public static final Target FIRST_NAME_INPUT = Target.the("Campo primer nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Campo apellido")
            .located(By.id("lastName"));
    public static final Target EMAILD_INPUT = Target.the("Campo correo electronico")
            .located(By.id("email"));
    public static final Target MONTH_FIELD = Target.the("Select Mes")
            .located(By.id("birthMonth"));
    public static final Target DAY_FIELD = Target.the("Select Dia")
            .located(By.id("birthDay"));
    public static final Target YEAR_FIELD = Target.the("Select Año")
            .located(By.id("birthYear"));
    public static final Target NEXT_LOCATION_BTN = Target.the("Boton Next:Location")
            .located(By.cssSelector(".btn-blue"));
}

