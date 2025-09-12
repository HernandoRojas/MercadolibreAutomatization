package runner;
//import org.junit.AfterClass;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import pages.BasePage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", //Directorio de archivos .features
    glue = "steps", //Directorio donde están las clases dfiniendo los steps escritos en el feature file
    plugin = {"pretty","html:target/cucumber-reports", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, tags = "@SaberCategorias")

//Comando para correr el tag deseado: ./gradlew test -D  "cucumber.filter.tags=@Tag"

public class TestRunner extends AbstractTestNGCucumberTests{
    @AfterClass
    public static void limpiarDriver(){
        BasePage.cerrarNavegador();
    }
}