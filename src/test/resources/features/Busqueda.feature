Feature: Navegación con búsqueda
    Para buscar artículos de mi interés
    Sin necesidad de estar logueado
    Puedo buscar articulos ingresando el nombre o palabra clave

@BuscarArticulo
Scenario: Buscar artículo por palabra clave
    Given El usuario navega a la pagina www.mercadolibre.com.co
    When busca la palabra Mancuerna
    Then Se listan articulos con la palabra clave Mancuerna