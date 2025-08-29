package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaginaPrincipal extends BasePage{
    
    private String localizadorLabelCategorias = "//a[normalize-space()='Categorías' and @href]";
    private String localizadorListaCategorias = "/html/body/header/div/div[5]/div/ul/li[1]/div/ul";
    private String urlPaginaPrincipal = "https://www.mercadolibre.com.co";

    public PaginaPrincipal(){
        super(driver);
    }

    //Método para navegar a la página principal de mercado libre, usa el metodo NavigateTo de la clase BasePage
    public void irAPaginaPrincipal(){ 
        navigateTo(urlPaginaPrincipal);
    }  

    // Método para obtener el texto del elemento web, en este caso para categorías, usa el metodo ObtenertextoDeElementoWeb de la clase BasePage el cual extrae el texto que tiene un elemento web usando como parámetro el localizador
    public String obtenerNombreCategoria(){
        return obtenerTextoDeElementoWeb(localizadorLabelCategorias);
    }

    // Método para dar click al elemento Web, en este caso para categorías, usa el metodo ClickElement de la clase BasePage usando como parámetro el localizador
    public void clickEnCategorias(){
        clickElement(localizadorLabelCategorias);
    }

    //Método para obtener la longitud de la lista de categorias que en este caso es un elemento ul, usa el método obtenerTamanoDeListaUl de la clase BasePage usando como parámetro el localizador de la lista ul
    public int longitudDeLaListaCategorias(){
        return obtenerTamanoDeListaUl(localizadorListaCategorias);
    }

}
