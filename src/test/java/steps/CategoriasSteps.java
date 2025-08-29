package steps;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;


public class CategoriasSteps {
    
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("El usuario navega a la página de mercado libre www.mercadolibre.com.co")
    public void irAUrlPaginaPrincipal(){
        paginaPrincipal.irAPaginaPrincipal();
    }

    @Then("encuentra la opción Categorías")
    public void validarNombre(){
        String tituloEsperado = "Categorías";
        String tituloElemento = paginaPrincipal.obtenerNombreCategoria();

        Assert.assertEquals(tituloElemento, tituloEsperado);
    }

}
