import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SerenityTestSetup {

    public WebDriver getDriver() {
        // Configurar WebDriverManager para que descargue la versión correcta de ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Configurar las opciones del navegador para headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");

        return new ChromeDriver(options); // Devuelve el WebDriver configurado
    }
}
