package co.com.falabella.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.pagina_linio.IMAGE_LINIO;
import static co.com.falabella.pages.pagina_principal.*;


public class pasos_pagina_linio {

    @Dado("{actor} comprueba que el boton Linio aparezca en la pagina principal")
    public void buscarElMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(OK_SALTAR),
                Ensure.that(BOTON_LINIO).isDisplayed()

        );
    }
    @Cuando("{actor} da click en el Linio")
    public void daClickEnLinio(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_LINIO),
                Click.on(OK_SALTAR)
        );
    }
    @Entonces("{actor} esta en la pagina principal de Linio")
    public void estarEnLaPaginaDeLinio(Actor actor) {
        actor.attemptsTo(
                Ensure.that(IMAGE_LINIO).isDisplayed()
        );
    }
}

