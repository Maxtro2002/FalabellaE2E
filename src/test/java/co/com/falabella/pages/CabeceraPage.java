package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));

}
