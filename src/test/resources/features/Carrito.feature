Feature: Carrito de compra
    Para guardar articulos que quiero comprar
    Sin estar logueado
    Puedo agregar articulos al carrito

Scenario: Agregar artículo de categoría Deporte
    Given El usuario navega a la página www.mercadolibre.com.co
    And de clic en categorias
    And de clic en categoría deportes
    When selecciono la categoria musculo y fuerza
    And selecciono el tercer articulo de los articulos listados
    Then de clic agregar artículo al carrito
    And se presenta la página para iniciar sesion