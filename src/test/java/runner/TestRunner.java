package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", //Directorio de archivos .features
    glue = "steps", //Directorio donde están las clases dfiniendo los steps escritos en el feature file
    plugin = {"pretty","html:target/cucumber-reports"}, tags = "@SaberCategorias")

//Comando para correr el tag deseado: gradle test -D  "cucumber.filter.tags=@Tag"

public class TestRunner {
    @AfterClass
    public static void limpiarDriver(){
        BasePage.cerrarNavegador();
    }
}