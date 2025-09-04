package pages;

public class PaginaModalCarrito extends BasePage{

    private String localizadorTituloAgregadoExitoso = "//h1[normalize-space()='Agregaste a tu carrito']";

    public PaginaModalCarrito(){
        super(driver);
    }
    
    public String obtenerTextoModalCarrito(){
        return obtenerTextoDeElementoWeb(localizadorTituloAgregadoExitoso);
    }
}
