# Proyecto Calculadora - Spring Boot

#Este es un proyecto  desarrollado en Spring Boot como parte de la evaluación sobre Automatización de Pruebas y Configuración del Entorno.

## 📌 Descripción

#La aplicación expone un endpoint REST que permite sumar dos números enteros mediante parámetros `a` y `b`.

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
### Pruebas Unitarias

![Pruebas Unitarias](evidencias/test_unitarios.jpg)
### Pruebas de Integración
![Pruebas de Integración](evidencias/TestIntegration_01.jpg)
![Pruebas de Integración](evidencias/TestIntegration_02.jpg)



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

### GitHub Actions funcionando
![CI en GitHub Actions](evidencias/pipeline.jpeg)

## 🔗 Repositorio

[Ver el proyecto en GitHub](https://github.com/gpcardonac/calculator)

