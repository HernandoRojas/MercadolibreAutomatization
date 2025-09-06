package steps;

import org.testng.Assert;

//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaArticulo;
import pages.PaginaPrincipal;
import pages.PaginaResultadosBusqueda;

public class BusquedaSteps {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    PaginaResultadosBusqueda paginaResultados = new PaginaResultadosBusqueda();
    PaginaArticulo paginaArticulo = new PaginaArticulo();
    
    @Given("El usuario navega a la pagina www.mercadolibre.com.co")
    public void irAUrlPaginaPrincipal(){  
    //Ir a pagina principal de mercado libre
        paginaPrincipal.irAPaginaPrincipal();
    }

    @When("busca la palabra {word}")
    public void buscarPorPalabraClave(String textoParaBusqueda){
        //Busca el artículo por palabra clave ingresando la palabra en el campo de texto de busqueda
        paginaPrincipal.escribirEnBarraDeBusqueda(textoParaBusqueda);
        paginaPrincipal.clicBotonBarraDeBusqueda();
    }
     
    @Then("Se listan articulos con la palabra clave {word}")
    public void validarTituloBusqueda(String titulo){
        //Se valida que el articulo seleccionado tenga por título el esperado
        String tituloExistente = paginaResultados.obtenerTituloResultado();
        String tituloEsperado = titulo;
        Assert.assertEquals(tituloExistente,tituloEsperado);
    }

    // Steps para escenario número 2 @BuscarArticulos

    @When("busque {string} en el campo de busqueda")
    public void buscarArticulos(String textoParaBusqueda){
        //Busca el artículo por palabra clave ingresando la palabra en el campo de texto de busqueda
        paginaPrincipal.escribirEnBarraDeBusqueda(textoParaBusqueda);
        paginaPrincipal.clicBotonBarraDeBusqueda();
    }

    @Then("el sistema muestra resultados para cada {string}")
    public void validarBusquedaArticulos(String titulo){
        //Se valida que el articulo seleccionado tenga por título el esperado
        String tituloExistente = paginaResultados.obtenerTituloResultado();
        String tituloEsperado = titulo;
        Assert.assertEquals(tituloExistente,tituloEsperado);
    }
}
