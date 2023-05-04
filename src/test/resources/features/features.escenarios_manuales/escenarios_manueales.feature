# language: es
@Manual
Escenario: Búsqueda de productos por categoría
Dado que el usuario está en la página de Falabella
Cuando el usuario selecciona una categoría de productos
Entonces se muestran los productos correspondientes a esa categoría.

@Manual
Escenario: Filtro de búsqueda por marca
Dado que el usuario está en la página de Falabella
Cuando el usuario busca productos de una marca específica
Entonces se muestran los productos de esa marca.

@Manual
Escenario: Ubicación de tiendas físicas
Dado que el usuario está en la página de Falabella
Cuando el usuario busca tiendas físicas en su ciudad
Entonces se muestran las tiendas Falabella en su ciudad con su dirección y horario.

@Manual
Escenario: Compra de un producto en oferta
Dado que el usuario está en la página de Falabella
Cuando el usuario busca productos en oferta
Y selecciona un producto de oferta para comprar
Entonces se muestra el precio de oferta y se puede realizar la compra.

@Manual
Escenario: Verificación de disponibilidad de un producto en tienda física
Dado que el usuario está en la página de Falabella
Cuando el usuario busca un producto específico
Y selecciona la opción de "verificar disponibilidad en tienda"
Entonces se muestra si el producto está disponible en una tienda física cercana y la cantidad disponible.