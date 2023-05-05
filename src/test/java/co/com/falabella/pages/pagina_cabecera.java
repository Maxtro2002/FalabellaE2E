package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pagina_cabecera {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));
    public static Target OK_SALTAR = Target.the("Saltar").located(By.id("testId-onboarding-desktop-skip"));

}