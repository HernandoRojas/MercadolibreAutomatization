package steps;

import org.testng.Assert;
//import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;


public class CategoriasSteps {
    
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("El usuario navega a la página de mercado libre www.mercadolibre.com.co")
    public void irAUrlPaginaPrincipal(){
        paginaPrincipal.irAPaginaPrincipal();
    }

    @When("Da clic en la opción Categorías del navbar")
    public void clickCategorias(){
        paginaPrincipal.clickEnCategorias();
        
    }

    @Then("Se listan 24 categorías")
    public void validarNombre(){ 
        int cantidadEsperada = 24;
        int cantidadExistente = paginaPrincipal.longitudDeLaListaCategorias();
        Assert.assertEquals(cantidadExistente, cantidadEsperada);
    }

}
