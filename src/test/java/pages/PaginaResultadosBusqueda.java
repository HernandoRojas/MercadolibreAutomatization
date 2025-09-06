package pages;

public class PaginaResultadosBusqueda extends BasePage{

    private String localizadorTituloPalabraClave = "//h1[@class='ui-label-builder ui-search-breadcrumb__title']";

    public PaginaResultadosBusqueda(){
        super(driver);
    }
    
    public String obtenerTituloResultado(){
        return obtenerTextoDeElementoWeb(localizadorTituloPalabraClave);
    }
}
