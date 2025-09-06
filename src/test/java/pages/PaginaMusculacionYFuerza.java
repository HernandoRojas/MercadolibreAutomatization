package pages;

public class PaginaMusculacionYFuerza extends BasePage{
    
    private String localizadorTercerElemento = "/html[1]/body[1]/main[1]/div[1]/div[2]/section[1]/div[5]/ol[1]/li[3]/div[1]/div[1]/div[1]/div[2]/h3[1]/a[1]";

    public PaginaMusculacionYFuerza(){
        super(driver);
    }

    public void clicTercerElemento(){
        clickElement(localizadorTercerElemento);
    }
}
