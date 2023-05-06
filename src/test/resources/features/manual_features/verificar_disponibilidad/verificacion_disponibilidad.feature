# language: es
Característica: Verificación disponibilidad
  @Manual
    Escenario: Verificación de disponibilidad de un producto en tienda física
      Dado Fede está en la página de Falabella
      Cuando Fede busca un producto específico
      Y selecciona la opción de "verificar disponibilidad en tienda"
      Entonces se muestra si el producto está disponible en una tienda física cercana y la cantidad disponible.