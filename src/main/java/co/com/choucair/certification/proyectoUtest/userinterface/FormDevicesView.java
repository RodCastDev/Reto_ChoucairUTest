package co.com.choucair.certification.proyectoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormDevicesView extends PageObject {
    public static final Target COMPUTER_FIELD = Target.the("Lista Tu computador")
            .located(By.cssSelector("#web-device .form-group:first-child .ui-select-box"));
    public static final Target COMPUTER_INPUT = Target.the("Input Tu computador")
            .located(By.cssSelector("#web-device .form-group:first-child .ui-select-box .ui-select-search"));
    public static final Target VERSION_FIELD = Target.the("Lista Version")
            .located(By.cssSelector("#web-device .form-group:nth-child(2) .ui-select-box"));
    public static final Target VERSION_INPUT = Target.the("Input Version")
            .located(By.cssSelector("#web-device .form-group:nth-child(2) .ui-select-box .ui-select-search"));
    public static final Target LANGUAGE_FIELD = Target.the("Lista Lenguaje")
            .located(By.cssSelector("#web-device .form-group:nth-child(3) .ui-select-box"));
    public static final Target LANGUAGE_INPUT = Target.the("Input Lenguaje")
            .located(By.cssSelector("#web-device .form-group:nth-child(3) .ui-select-box .ui-select-search"));
    public static final Target BRAND_FIELD = Target.the("Lista Modelo")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(1) .ui-select-box"));
    public static final Target BRAND_INPUT = Target.the("Input Modelo")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(1) .ui-select-box .ui-select-search"));
    public static final Target MODEL_FIELD = Target.the("Lista Modelo")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(2) .ui-select-box"));
    public static final Target MODEL_INPUT = Target.the("Input Modelo")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(2) .ui-select-box .ui-select-search"));
    public static final Target SYSTEM_FIELD = Target.the("Lista Sistema")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(3) .ui-select-box"));
    public static final Target SYSTEM_INPUT = Target.the("Input Sistema")
            .located(By.cssSelector("#mobile-device .form-group:nth-child(3) .ui-select-box .ui-select-search"));
}
