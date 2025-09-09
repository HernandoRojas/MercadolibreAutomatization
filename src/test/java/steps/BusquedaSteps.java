package steps;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.ConfigReader;
import pages.PaginaArticulo;
import pages.PaginaPrincipal;
import pages.PaginaResultadosBusqueda;

public class BusquedaSteps {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    PaginaResultadosBusqueda paginaResultados = new PaginaResultadosBusqueda();
    PaginaArticulo paginaArticulo = new PaginaArticulo();
    ConfigReader configReader = new ConfigReader();
    
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

    // Steps para escenario número 2 @BuscarArticuloEspecifico

    @When("busque el articulo {word}")
    public void buscarArticuloMancuerna(String palabra){
        paginaPrincipal.escribirEnBarraDeBusqueda(palabra);
        paginaPrincipal.clicBotonBarraDeBusqueda();
    }

    @And("seleccione el segundo elemento")
    public void verSegundoElemento(){
        paginaResultados.clicSegundoElemento();
    }

    @Then("el articulo tiene por nombre {string}")
    public void validarArticulo(String articulo){
        String tituloEsperado = articulo;
        String tituloExistente = paginaArticulo.obtenerTituloArticulo();
        Assert.assertEquals(tituloExistente, tituloEsperado);
    }

}
