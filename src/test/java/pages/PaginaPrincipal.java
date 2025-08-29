package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaginaPrincipal extends BasePage{
    
    private String localizadorLabelCategorias = "//a[normalize-space()='Categorías' and @href]";
    private String urlPaginaPrincipal = "https://www.mercadolibre.com.co";

    public PaginaPrincipal(){
        super(driver);
    }

    public void irAPaginaPrincipal(){
        navigateTo(urlPaginaPrincipal);
    }  

    public String obtenerNombreCategoria(){
        return obtenerTextoDeElementoWeb(localizadorLabelCategorias);
    }
}
