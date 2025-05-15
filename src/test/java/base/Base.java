package base;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base extends PageObject {

    public void type(String inputText, By locator) {
        getDriver().findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) {
        getDriver().findElement(locator).click();
    }

    public void visit(String url) {
        getDriver().get(url);
    }

    public void maximize() {
        getDriver().manage().window().maximize();
    }

    public void waitForElement(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
