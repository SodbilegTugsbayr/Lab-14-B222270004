# Lab 14 - 100% Coverage Maven Sample

This is a minimal Maven project with a single `Calculator` class and JUnit 5 tests that drive 100% line coverage via JaCoCo.

## Project layout

- `pom.xml` – Maven config with JUnit 5 and JaCoCo
- `src/main/java/com/example/Calculator.java` – simple arithmetic operations
- `src/test/java/com/example/CalculatorTest.java` – tests covering every line and branch

## Run tests and coverage

```bash
mvn test
mvn verify   # generates coverage report at target/site/jacoco/index.html
```
