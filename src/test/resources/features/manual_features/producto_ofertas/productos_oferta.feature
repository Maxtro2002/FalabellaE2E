# language: es
Característica: productos ofertas

  @Manual
    Escenario: Compra de un producto en oferta
      Dado que Fede está en la página de Falabella
      Cuando Fede busca productos en oferta
      Y selecciona un producto de oferta para comprar
      Entonces se muestra el precio de oferta y se puede realizar la compra.