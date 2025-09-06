package pages;

public class PaginaArticulo extends BasePage {
    
    private String localizadorBotonAgregarAlCarrito = "//span[normalize-space()='Agregar al carrito']";
    private String localizadorTituloDelProducto = "//h1[@class='ui-pdp-title']";

    public PaginaArticulo(){
        super(driver);
    }

    public void clicAgregarAlCarrito(){
        clickElement(localizadorBotonAgregarAlCarrito);
    }

    public String obtenerTituloArticulo(){
        return obtenerTextoDeElementoWeb(localizadorTituloDelProducto);
    }
}
