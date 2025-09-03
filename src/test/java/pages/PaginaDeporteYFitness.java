package pages;

public class PaginaDeporteYFitness extends BasePage {

    private String localizadorCategoriaMusculacionYfuerza = "//img[@alt='Musculo y fuerza']";

    public PaginaDeporteYFitness(){
        super(driver);
    }
    
    public void clicAMusculacionYFuerza(){
        clickElement(localizadorCategoriaMusculacionYfuerza);
    }

}
