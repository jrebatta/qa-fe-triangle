package steps;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import pages.TrianglePage;

public class TriangleSteps {

    @Steps
    TrianglePage trianglePage;

    private int ladoA, ladoB, ladoC;

    @Given("el usuario accede a la página principal")
    public void elUsuarioAccedeALaPáginaPrincipal() {
        trianglePage.ingresarATriangle();
    }

    @When("ingresa su nombre como {string}")
    public void ingresaSuNombreComo(String usuario) {
        trianglePage.ingresarNombre(usuario);
    }

    @Then("el triángulo con lados {string}, {string}, {string} debe ser válido")
    public void elTriánguloConLadosDebeSerVálido(String a, String b, String c) {
        ladoA = Integer.parseInt(a);
        ladoB = Integer.parseInt(b);
        ladoC = Integer.parseInt(c);

        if (!esTrianguloValido(ladoA, ladoB, ladoC)) {
            throw new AssertionError("Los lados no forman un triángulo válido");
        }

        trianglePage.ingresaLosLados(a, b, c);
    }

    @And("presiona el botón Check")
    public void presionaElBotónCheck() {
        trianglePage.presionarBotonCheck();
    }

    @Then("el tipo calculado del triángulo debe ser {string}")
    public void elTipoCalculadoDelTriánguloDebeSer(String esperado) {
        String tipo = calcularTipoTriangulo();
        if (!tipo.equalsIgnoreCase(esperado)) {
            throw new AssertionError("Tipo incorrecto. Esperado: " + esperado + ", pero se calculó: " + tipo);
        }
    }

    @Then("intento formar triángulo con lados {string}, {string}, {string}")
    public void intentoFormarTriangulo(String a, String b, String c) {
        ladoA = Integer.parseInt(a);
        ladoB = Integer.parseInt(b);
        ladoC = Integer.parseInt(c);

        trianglePage.ingresaLosLados(a, b, c);
    }

    @Then("no se debe considerar un triangulo valido")
    public void noSeDebeConsiderarUnTriánguloValido() {
        if (esTrianguloValido(ladoA, ladoB, ladoC)) {
            throw new AssertionError("Estos lados sí forman un triángulo, pero deberían ser inválidos");
        }
    }

    private boolean esTrianguloValido(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private String calcularTipoTriangulo() {
        if (ladoA == ladoB && ladoB == ladoC) return "Equilateral";
        if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) return "Isosceles";
        return "Scalene";
    }
}
