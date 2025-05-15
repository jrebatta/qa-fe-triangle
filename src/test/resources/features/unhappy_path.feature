Feature: Validacion de triángulos inválidos

  Background:
    Given el usuario accede a la página principal

  @unhappypath
  Scenario Outline: Validar que los lados no formen un triangulo válido
    When ingresa su nombre como "<usuario>"
    Then intento formar triángulo con lados "<ladoA>", "<ladoB>", "<ladoC>"
    And presiona el botón Check
    Then no se debe considerar un triangulo valido

    Examples:
      | usuario | ladoA | ladoB | ladoC |
      | Luis    | 1     | 2     | 10    |
      | Ana     | 2     | 2     | 5     |
