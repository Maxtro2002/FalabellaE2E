package co.com.falabella.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static co.com.falabella.pages.pagina_cabecera.BARRA_BUSQUEDA;
import static co.com.falabella.pages.pagina_cabecera.OK_SALTAR;
import static co.com.falabella.pages.pagina_carrito.LIST_CARRITO;
import static co.com.falabella.pages.pagina_detalles.BOTON_VER_CARRITO;
import static co.com.falabella.pages.pagina_busqueda.BOTON_AGREGAR_CARRITO_PRIMER_ELEMENTO;


public class pasos_barra_de_busqueda {

    @Dado("que {actor} busca {string}")
    public void buscarBarra(Actor actor, String producto) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Enter.theValue(producto).into(BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }
    @Cuando("{actor} agrega el primer elemento al carrito de compras")
    public void agregarPrimerElementoAlCarrito(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Click.on(BOTON_AGREGAR_CARRITO_PRIMER_ELEMENTO),
                Click.on(BOTON_VER_CARRITO)
        );
    }
    @Entonces("{actor} debe encontrar al menos {string} en el carrito de compras")
    public void buscarXCantidadProductosEnElCarrito(Actor actor, String cantidadProductos) {
        actor.attemptsTo(
                Ensure.that(LIST_CARRITO).text().isEqualTo(cantidadProductos)
        );

    }
}
