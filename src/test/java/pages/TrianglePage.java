package pages;

import base.Base;
import locators.TriangleLocators;

public class TrianglePage extends Base {

    private final TriangleLocators triangleLocators = new TriangleLocators();

    public void ingresarATriangle() {
        visit("https://www.developsense.com/triangle/triangle.html");
        maximize();
    }

    public void ingresarNombre(String usuario) {
        waitForElement(triangleLocators.username, 5);
        type(usuario, triangleLocators.username);
    }

    public void ingresaLosLados(String ladoA, String ladoB, String ladoC) {
        waitForElement(triangleLocators.ladoA, 5);
        type(ladoA, triangleLocators.ladoA);
        type(ladoB, triangleLocators.ladoB);
        type(ladoC, triangleLocators.ladoC);
    }

    public void presionarBotonCheck() {
        waitForElement(triangleLocators.btnCheck, 5);
        click(triangleLocators.btnCheck);
    }
}
