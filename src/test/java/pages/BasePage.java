package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    
    protected static WebDriver driver; //Se crea la variable driver de tipo WebDriver, esta variable va a ser utilizada por todas las instancias de BasePage y sus subclases
    WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(5)); //Se define la variable de espera con el valor de 5 segundos

    static { 
        //Se instancia el WebDriverManager, es decir, aquí se instancia lo que nos ayudará a manejar el navegador web Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public BasePage(WebDriver driver){
        // Constructor de la clase BasePage que acepta un objeto WebDriver como argumento
        BasePage.driver = driver;
    }

    public static void navigateTo(String url){
        //Se define el método para navegar/dirigirse a la url definida o enviada como parámetro
        driver.get(url);
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        //Método para dar clic a un elemento enviando como parámetro el localizador
        Find(locator).click();
    }

    public static void cerrarNavegador(){
        //Método para cerrar navegador y la instancia del driver
        driver.quit();
    }

    public void escribir(String locator,String texto){
        //Método para limpiar un cmapo de texto y luego escribir un valor textual en este cmapo
        Find(locator).clear();
        Find(locator).sendKeys(texto);
    }

    public String obtenerTextoDeElementoWeb(String locator){
        WebElement elementoWeb = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        String textoDeElemento = elementoWeb.getText();
        return textoDeElemento;
    }

    public void seleccionarDeListaPorValor(String locator,String valor){
        //Método para selecionar un elemento de una lista desplegable según su valor
        Select lista = new Select(Find(locator));
        lista.selectByValue(valor);
    }

    public void seleccionarDeListaPorIndice(String locator,Integer indice){
        //Método para selecionar un elemento de una lista desplegable según su índice
        Select lista = new Select(Find(locator));
        lista.selectByIndex(indice);
    }

    public int tamanoLista(String locator){
        //Metodo para obtener el tamaño de una lista desplegable
        Select lista = new Select(Find(locator));

        List<WebElement> listaOpciones = lista.getOptions();

        return listaOpciones.size();
    }

    public List<String> obtenerValorDeLaLista(String locator){
        Select lista = new Select(Find(locator));

        List<WebElement> opcionesLista = lista.getOptions();
        List<String> values = new ArrayList<>();
        for(WebElement option : opcionesLista){
            values.add(option.getText());
        }
        return values;
    }
}
