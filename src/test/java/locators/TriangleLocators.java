package locators;

import org.openqa.selenium.By;

public class TriangleLocators {

    public By username = By.id("username");
    public By ladoA = By.id("SideA");
    public By ladoB = By.id("SideB");
    public By ladoC = By.id("SideC");
    public By btnCheck = By.xpath("//button[@onclick='processTriangle()']");

}
