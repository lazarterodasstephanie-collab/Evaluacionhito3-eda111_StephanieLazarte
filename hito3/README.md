# Hito 3 - EDA111

API REST con Spring Boot para gestionar calificaciones, asientos y estudiantes.

## Tecnologías
- Java 17
- Spring Boot
- Maven

## Cómo ejecutar
```bash
mvn spring-boot:run
```

## Endpoints

### Notas
- GET /notas/agregar?valor=85
- GET /notas
- GET /notas/promedio
- GET /notas/max
- GET /notas/min

### Aula
- GET /aula
- GET /aula/ocupados
- GET /aula/ocupar?fila=1&columna=2
- GET /aula/liberar?fila=1&columna=2

### Estudiantes
- GET /estudiantes/agregar?nombre=Ana&puntaje=95&id=1
- GET /estudiantes
- GET /estudiantes/ordenados
- GET /estudiantes/buscar/Juan

## Ejemplos
- http://localhost:8080/notas/agregar?valor=75
- http://localhost:8080/aula/ocupar?fila=0&columna=0
- http://localhost:8080/estudiantes/agregar?nombre=Ana&puntaje=95&id=1