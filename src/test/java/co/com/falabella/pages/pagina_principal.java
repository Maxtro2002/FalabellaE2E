package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class pagina_principal {
     public static Target OK_SALTAR = Target.the("Saltar").located(By.id("testId-onboarding-desktop-skip"));

    public static Target BOTON_LINIO = Target.the("Boton de Linio").locatedBy("//div[@class=\"NavbarLinks-module_store-icon-wrapper__3Pvd3 NavbarLinks-module_last-store-icon__9XeAm\"]//a");

    public static Target BOTON_Carrito = Target.the("Boton de Carrito").locatedBy("//a[@id=\"testId-UserAction-basket\"]");

    public static Target  BOTON_TYC= Target.the("Boton de TYC").locatedBy("//a[@href=\"https://www.falabella.com.co/falabella-co/page/terminos-y-condiciones\"]");

    public static Target  SECCION_AYUDA= Target.the("Seccion de ayuda").located(By.id("testId-extra-links-dropdown-4"));

    public static Target  BOTON_HORARIO_TIENDA= Target.the("Boton de horario de las tiendas").located(By.id("testId-bottom-header-links-4-2"));


}