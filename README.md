# qa-fe-triangle

Automatización de pruebas frontend para la validación de tipos de triángulos.  
El proyecto está desarrollado en Java con Gradle, usando Serenity BDD, Selenium y Cucumber.

## 🧪 Features implementadas

### ✔️ Validación de triángulos válidos (`@happypath`)
- Equilateral
- Isosceles
- Scalene

### ❌ Validación de triángulos inválidos (`@unhappypath`)
- Lados que no cumplen la regla de existencia

Todos los escenarios están etiquetados con `@allTests` para ejecutar el conjunto completo.

---

## ▶️ Ejecución

### Ejecutar todos los tests:

```bash
./gradlew clean test aggregate -Dtag="@allTests"
