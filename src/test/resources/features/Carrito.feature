Feature: Carrito de compra
    Para guardar articulos que quiero comprar
    Logueado y sin loguear
    Puedo agregar articulos al carrito

@AgregarAlcarritoSinLogin
Scenario: Agregar artículo de categoría Deporte sin Login
    Given El usuario navega a la página www.mercadolibre.com.co
    And de clic en categoría deportes
    When elije la categoria musculo y fuerza
    And agregue al carrito el tercer artículo de los resultados
    Then se presenta la página para iniciar sesion

@AgregarAlcarritoConLogin
Scenario: Agregar artículo de categoría Deporte con Login
    Given El usuario navega a la página www.mercadolibre.com.co logueado
    When elije la opcion musculo y fuerza
    And agregue al carrito el tercer artículo de los resultados de musculacion
    Then se agrega el articulo al carrito