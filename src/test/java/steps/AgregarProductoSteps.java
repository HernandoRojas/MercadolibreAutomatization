package steps;

import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaArticulo;
import pages.PaginaDeporteYFitness;
import pages.PaginaLoginCarrito;
import pages.PaginaMusculacionYFuerza;
import pages.PaginaPrincipal;

public class AgregarProductoSteps {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    PaginaDeporteYFitness paginaDeportes = new PaginaDeporteYFitness();
    PaginaMusculacionYFuerza paginaMusculacion = new PaginaMusculacionYFuerza();
    PaginaArticulo paginaArticulo = new PaginaArticulo();
    PaginaLoginCarrito paginaLogin = new PaginaLoginCarrito();

    //Escenario número 1, Agregar producto al carrito sin estar logueado:

    @Given("El usuario navega a la página www.mercadolibre.com.co")
    public void irAUrlPaginaPrincipal(){
        //Ir a pagina principal de mercado libre
        paginaPrincipal.irAPaginaPrincipal();
    }

    @And("de clic en categoría deportes")
    public void clickCategoriaDeportes(){
        //clic en categorias, luego clic en categoria 'musculo y fuerza'
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
    //Clic a tercer articulo de la lista (Identificar el tercero puntualmente, no dar clic fijo, siempre debe ser el tercero)

    @Then("se presenta la página para iniciar sesion")
    public void validarLogin(){
        String tituloEsperado = "¡Hola! Para agregar al carrito, ingresa a tu cuenta";
        String tituloExistente = paginaLogin.obtenerTextoLogin();
        Assert.assertEquals(tituloExistente, tituloEsperado);
    }
}
