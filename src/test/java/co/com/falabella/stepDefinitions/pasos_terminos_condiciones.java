package co.com.falabella.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.pagina_principal.*;
import static co.com.falabella.pages.pagina_terminos_y_condiciones.ACCORDEON_TYC;


public class pasos_terminos_condiciones {

    @Dado("{actor} se dirige haciendo scroll hasta el boton de terminos y condiciones")
    public void ScrollHastaTerminosYCondiciones(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Scroll.to(BOTON_TYC)

        );
    }
    @Cuando("{actor} da click a terminos y condiciones")
    public void ClickBotonTYC(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_TYC)
        );
    }
    @Entonces("{actor} debe de estar todos los terminos y condiciones")
    public void Acordion_TYC(Actor actor) {
        actor.attemptsTo(
                Click.on(OK_SALTAR),
                Ensure.that(ACCORDEON_TYC).textValues().hasSizeGreaterThanOrEqualTo(22)
        );
    }
}

