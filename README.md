
# Proyecto Calculadora - Spring Boot

Este es un proyecto sencillo desarrollado en Spring Boot como parte de la evaluación sobre Automatización de Pruebas y Configuración del Entorno.

## 📌 Descripción

La aplicación expone un endpoint REST que permite sumar dos números enteros mediante parámetros `a` y `b`.

**Endpoint:**  
```
GET /calculator/sum?a=2&b=3
```
**Respuesta:**  
```
5
```

---

## ⚙️ Tecnologías utilizadas

- Java 17
- Spring Boot 3.3.10
- Gradle
- JUnit 5
- MockMvc (para pruebas de integración)

---

## 🧪 Pruebas Automatizadas

Se implementaron:

- ✅ Dos pruebas unitarias en `CalculatorControllerTest`
- ✅ Una prueba de integración en `CalculatorIntegrationTest`

Las pruebas pueden ejecutarse con:

```
./gradlew test
```

---

## 📂 Estructura del proyecto

```
src/
├── main/
│   └── java/com/example/calculator/controller/CalculatorController.java
└── test/
    └── java/com/example/calculator/controller/
        ├── CalculatorControllerTest.java
        └── CalculatorIntegrationTest.java
```

---

## 📸 Capturas recomendadas

- Creación del proyecto en Spring Initializr
- Código fuente del controlador y pruebas
- Ejecución de pruebas en terminal
- Push exitoso a GitHub

---

## 🔗 Repositorio

[Ver el proyecto en GitHub](https://github.com/gpcardonac/calculator)

