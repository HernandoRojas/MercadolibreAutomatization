# Proyecto personal de automatización a portal web de Mercado Libre

Este proyecto contiene un conjunto (Suite) de pruebas automatizadas para el portal web de Mercado Libre utilizando Cucumber, Selenium WebDriver, TestNG y Allure.

## Tecnologías Usadas

- **Lenguaje de Programación:** Java (JDK 21).
- **Herramienta de Construcción:** Gradle.
- **Frameworks de Pruebas:** 
  - Cucumber (para Gherkin).
  - TestNG (para la ejecución de pruebas y assertions).
- **Automatización Web:**
  - Selenium WebDriver.
  - WebDriverManager desde: https://github.com/bonigarcia/webdrivermanager
- **Reporte:** Allure Report.

## Prerrequisitos

Para ejecutar este proyecto, necesitas tener instalado:

- **Git** (para clonar el repositorio).
- **Java Development Kit (JDK) 21**.
- Un **IDE** de tu preferencia (IntelliJ IDEA, Visual Studio Code, etc.), para el desarrollo del proyecto se utilizó Visual Studio Code.

## Configuración
Abre una consola de git desde el directorio al que quieres clonar el repositorio.
1.  **Clona el repositorio:**
    ```bash
    git clone https://github.com/HernandoRojas/MercadolibreAutomatization.git
    ```
2.  **Sincroniza las dependencias:**
    No es necesario instalar Gradle globalmente. El proyecto usa el Gradle Wrapper (`./gradlew`) para gestionar las dependencias automáticamente. El IDE debería sincronizar las dependencias al abrir el proyecto.

## Ejecución de las Pruebas

Para ejecutar las pruebas desde la terminal, utiliza el Gradle Wrapper.

-   **Ejecutar todas las pruebas:**
    ```bash
    ./gradlew test
    ```
-   **Ejecutar pruebas con tags de Cucumber:**
    ```bash
    ./gradlew test -D "cucumber.filter.tags=@BuscarArticulo"
    ```
La lista de tags para cada escenario de pruebas es: 

- **@Saberategorias**: Verifica y compara la cantidad de categorias que se listan en el menú desplegable desde la opción 'Categorías' del menú principal.
- **@AgregarAlcarritoSinLogin**: Verifica que al agregar artículo al carrito, la página redirija al inicio de sesión.
- **@AgregarAlcarritoConLogin**: Verifica que al agregar artículo al carrito se muestre modal exitosamente. (Requiere de inicio de sesión previo al inicio de la automatización)
- **@BuscarArticulo**: Verifica que al buscar artículo por palabra clave se listen resultados que coincidan con la busqueda.
- **@BuscarArticulos**: Verifica que al buscar una lista de artículos por palabra clave se listen resultados que coincidan con la busqueda para cada uno de los artículos.
- **@BuscarArticuloEspecifico**: Verifica que se encuentre el artículo especifico por su título.
  
### Reportes

El reporte es generado con allure, no es necesaria la descarga e instalación de ninguna librería o paquete local.
Para generar un reporte, luego de ejecutar uno o varios test debes ejecutar los siguientes comandos desde la terminal y desde el directorio principal de tu proyecto local:

  1.  Genera el reporte HTML con el siguiente comando:
    
  ```bash
  ./gradlew allureReport --clean // --clean eliminará caché o reportes generados previamente
  ```
   2.  Para iniciar el servidor local de allure donde se podrá visualizar el reporte:
    
  ```bash
  ./gradlew allureServe 
  ```
    
  El reporte se abrirá automáticamente en tu navegador predeterminado.
