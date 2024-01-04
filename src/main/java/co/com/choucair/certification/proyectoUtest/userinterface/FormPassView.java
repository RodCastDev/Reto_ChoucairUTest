package co.com.choucair.certification.proyectoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormPassView extends PageObject {
    public static final Target PASSWORD_INPUT = Target.the("Input PassWord")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT = Target.the("Input confirmar password")
            .located(By.id("confirmPassword"));
    public static final Target TERMS_CHECKBOX = Target.the("Check box Terminos y condiciones")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target PRIVACY_CHECKBOX = Target.the("Check box Privacidad y Seguridad")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target TITLE_WELCOME_PAGE = Target.the("Titutlo pagina Bienvenida")
            .located(By.cssSelector(".image-box-header h1"));
}
