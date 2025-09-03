Feature: Navegación sobre las categorías
    Para seleccionar la categoría de un producto que quiero comprar
    Sin estar logueado
    Puedo ir a una categoría de producto

@SaberCategorias
Scenario: Conocer número de categorías
    Given El usuario navega a la página de mercado libre www.mercadolibre.com.co
    When Da clic en la opción Categorías del navbar
    Then Se listan 24 categorías