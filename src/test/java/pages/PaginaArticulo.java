package pages;

public class PaginaArticulo extends BasePage {
    
    private String localizadorBotonAgregarAlCarrito = "//span[normalize-space()='Agregar al carrito']";

    public PaginaArticulo(){
        super(driver);
    }

    public void clicAgregarAlCarrito(){
        clickElement(localizadorBotonAgregarAlCarrito);
    }
}
