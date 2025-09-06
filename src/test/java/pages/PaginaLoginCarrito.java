package pages;

public class PaginaLoginCarrito extends BasePage{
    
    private String localizadorLabelLogin = "//h1[@class='center-card__title']";

    public PaginaLoginCarrito(){
        super(driver);
    }

    public String obtenerTextoLogin(){
        return obtenerTextoDeElementoWeb(localizadorLabelLogin);
    }
}
