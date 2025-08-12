# Hexagonal Project

Este proyecto es una implementación de la arquitectura hexagonal (también conocida como Ports and Adapters) enfocada en el manejo de productos.

## Descripción

La aplicación está diseñada para demostrar los principios de la arquitectura hexagonal, separando claramente la lógica de negocio (dominio) de las capas de infraestructura y presentación. El caso de uso principal es la gestión de productos, permitiendo su creación, almacenamiento y consulta a través de puertos y adaptadores.

## Estructura del Proyecto

- **domain**: Contiene los modelos y puertos del dominio.
- **application**: Incluye los servicios de aplicación y casos de uso.
- **infrastructure**: Implementa los adaptadores de persistencia y web.

## Tecnologías

- Java
- Spring Boot
- JPA/Hibernate

## Ejecución

Para ejecutar el proyecto:

```bash
./mvnw spring-boot:run
```

---
Desarrollado como ejemplo de arquitectura hexagonal para manejo de productos.