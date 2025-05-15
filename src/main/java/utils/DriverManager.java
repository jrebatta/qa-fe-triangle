package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions()
                    .addArguments("--disable-gpu")
                    .addArguments("headless");
            driver.set(new ChromeDriver(options));
        }
        return driver.get();
    }

    public static void quitDriver() {
        WebDriver current = driver.get();
        if (current != null) {
            current.quit();
            driver.remove();
        }
    }
}
