Feature: Navegación con búsqueda
    Para buscar artículos de mi interés
    Sin necesidad de estar logueado
    Puedo buscar articulos ingresando el nombre o palabra clave

    Background: Navego a la pagina principal mercadolibre
    Given El usuario navega a la pagina www.mercadolibre.com.co

@BuscarArticulo
Scenario: Buscar artículo por palabra clave
    When busca la palabra Mancuerna
    Then Se listan articulos con la palabra clave Mancuerna

@BuscarArticulos
Scenario Outline: Buscar distintos productos en la barra de búsqueda
    When busque <producto> en el campo de busqueda
    Then el sistema muestra resultados para cada <producto>
    Examples:
        | producto |
        | "Computador Gamer" |
        | "Iphone 13"  |
        | "PlayStation" |

@BuscarArticuloEspecifico
Scenario: Buscar Artículo especifico
    When busque el articulo Mancuerna
    And seleccione el segundo elemento
    Then el articulo tiene por nombre "Kit 2 Mancuernas Magnux 21kgestuche 20 Kg Con Estuche Para Ejercicio Color Negro"