package co.com.choucair.certification.proyectoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormAddressView extends PageObject {

    public static final Target DELETE_BTN = Target.the("Boton x borrar")
            .located(By.xpath("//mat-icon[@aria-hidden='true']"));
    public static final Target CITY_FIELD = Target.the("Select Ciudad")
            .located(By.xpath("//input[contains(@class,'ng-touched ng-valid ng-pristine')]"));
    public static final Target ZIP_FIELD = Target.the("Campo Zip o Codigo Postal")
            .located(By.id("zip"));
    public static final Target COUNTRY_FIELD = Target.the("Campo país")
            .located(By.xpath("//span[@aria-label='Select a country']"));
    public static final Target COUNTRY_FIELD_TEXT = Target.the("Campo país texto")
            .located(By.xpath("//input[@placeholder='Select a country']"));
}
