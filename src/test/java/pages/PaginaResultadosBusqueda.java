package pages;

public class PaginaResultadosBusqueda extends BasePage{

    private String localizadorTituloPalabraClave = "//h1[@class='ui-label-builder ui-search-breadcrumb__title']";
    private String localizadorSegundoElemento = "/html[1]/body[1]/main[1]/div[1]/div[2]/section[1]/div[5]/ol[1]/li[2]/div[1]/div[1]/div[1]/div[2]/h3[1]/a[1]";

    public PaginaResultadosBusqueda(){
        super(driver);
    }
    
    public String obtenerTituloResultado(){
        return obtenerTextoDeElementoWeb(localizadorTituloPalabraClave);
    }

    public void clicSegundoElemento(){
        clickElement(localizadorSegundoElemento);
    }
}
