Feature: Validacion de triangulos

  Background:
    Given el usuario accede a la página principal

  @happypath
  Scenario Outline: Validar que el triangulo formado tenga el tipo correcto de un: <resultado>
    When ingresa su nombre como "<usuario>"
    Then el triángulo con lados "<ladoA>", "<ladoB>", "<ladoC>" debe ser válido
    And presiona el botón Check
    Then el tipo calculado del triángulo debe ser "<resultado>"

    Examples:
      | usuario | ladoA | ladoB | ladoC | resultado   |
      | Juan    | 5     | 5     | 5     | Equilateral |
      | Pedro   | 4     | 4     | 3     | Isosceles   |
      | Pablo   | 3     | 4     | 5     | Scalene     |