package steps;

import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaArticulo;
import pages.PaginaDeporteYFitness;
import pages.PaginaLoginCarrito;
import pages.PaginaModalCarrito;
import pages.PaginaMusculacionYFuerza;
import pages.PaginaPrincipal;

public class AgregarProductoSteps {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    PaginaDeporteYFitness paginaDeportes = new PaginaDeporteYFitness();
    PaginaMusculacionYFuerza paginaMusculacion = new PaginaMusculacionYFuerza();
    PaginaArticulo paginaArticulo = new PaginaArticulo();
    PaginaLoginCarrito paginaLogin = new PaginaLoginCarrito();
    PaginaModalCarrito paginaModal = new PaginaModalCarrito();

    //Escenario número 1, Agregar producto al carrito sin estar logueado:

    @Given("El usuario navega a la página www.mercadolibre.com.co")
    public void irAUrlPaginaPrincipal(){
        //Ir a pagina principal de mercado libre
        paginaPrincipal.irAPaginaPrincipal();
    }

    @And("de clic en categoría deportes")
    public void clickCategoriaDeportes(){
        //clic en categorias, luego clic en categoria 'Deportes y Fitness'
        paginaPrincipal.clickEnCategorias();
        paginaPrincipal.clicCategoriaDeportes();
    }
    

    @When("elije la categoria musculo y fuerza")
    public void clicMusculoYFuerza(){
        //clic en categoria musculo y fuerza
        paginaDeportes.clicAMusculacionYFuerza();
        
    }

    @And("agregue al carrito el tercer artículo de los resultados")
    public void agregarAlCarrito(){
        //Clic a tercer elemento de los resultados y cuando está en detalle del artículo da clic en 'Agregar al carrito'
        paginaMusculacion.clicTercerElemento();
        paginaArticulo.clicAgregarAlCarrito();
    }
    

    @Then("se presenta la página para iniciar sesion")
    public void validarLogin(){
        //Se valida que la página redirija al inicio de sesión, esto se hace obteniendo el texto de la pantalla de inicio de sesión
        String tituloEsperado = "¡Hola! Para agregar al carrito, ingresa a tu cuenta";
        String tituloExistente = paginaLogin.obtenerTextoLogin();
        Assert.assertEquals(tituloExistente, tituloEsperado);
    }


    //Escenario número 2, Agregar producto al carrito cuando se está logueado:
    //El usuario debe estar logueado antes de iniciar el caso de prueba
    //El escenario falla debido a que la instancia del navegador es nueva, por ellos no está logueado previamente, por ello es necesario automatizar el login

    @Given("El usuario navega a la página www.mercadolibre.com.co logueado")
    public void irAUrlPaginaPrincipalLogueado(){
        //Ir a pagina principal de mercado libre
        paginaPrincipal.irAPaginaPrincipal();
    }

    @When("elije la opcion musculo y fuerza")
    public void clicMusculoYFuerzaLogueado(){
        //clic en categorias
        paginaPrincipal.clickEnCategorias();
        //clic en categoria 'Deportes y Fitness'
        paginaPrincipal.clicCategoriaDeportes();
        //clic en categoria musculo y fuerza
        paginaDeportes.clicAMusculacionYFuerza();
        
    }

    @And("agregue al carrito el tercer artículo de los resultados de musculacion")
    public void agregarAlCarritoLogueado(){
        //Clic a tercer elemento de los resultados y cuando está en detalle del artículo da clic en 'Agregar al carrito'
        paginaMusculacion.clicTercerElemento();
        paginaArticulo.clicAgregarAlCarrito();
    }
    

    @Then("se agrega el articulo al carrito")
    public void validarArticuloEnCarrito(){
        //Se valida que el artículo se agregue al carrito
        String tituloEsperado = "Agregaste a tu carrito";
        String tituloExistente = paginaModal.obtenerTextoModalCarrito();
        Assert.assertEquals(tituloExistente, tituloEsperado);
    }

    //Escenario número 2, Agregar producto al carrito iniciando sesión:
}
