package co.com.choucair.certification.proyectoUtest.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class MainPageUtest extends PageObject {
    public static final Target BUTTON_JOINTODAY = Target.the("Boton Join Today")
            .located(By.cssSelector(".navbar .unauthenticated-nav-bar__sign-up"));

}
