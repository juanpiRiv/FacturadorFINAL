# Facturador API

Un proyecto de facturación desarrollado en Java que ofrece una API REST para gestionar y consultar facturas. Este proyecto utiliza una base de datos en memoria H2 y puede ejecutarse en un contenedor Docker. Además, cuenta con documentación de API generada con Swagger y se proporcionan pruebas con Postman.

## Tabla de Contenidos
- [Características](#características)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Instalación](#instalación)
  - [Requisitos previos](#requisitos-previos)
  - [Configuración Local](#configuración-local)
  - [Ejecución en Docker](#ejecución-en-docker)
- [Documentación API](#documentación-api)
- [Pruebas con Postman](#pruebas-con-postman)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Características

- CRUD completo para gestión de facturas.
- API REST documentada con Swagger.
- Base de datos en memoria H2 para un entorno liviano.
- Compatible con Docker para una fácil implementación.
- Colección de pruebas en Postman incluida.

## Tecnologías Utilizadas

- **Java** - Versión 11 o superior.
- **Spring Boot** - Framework principal para el desarrollo de la API.
- **H2 Database** - Base de datos en memoria para desarrollo y pruebas.
- **Swagger** - Generación de documentación de la API.
- **Docker** - Para la creación de contenedores de la aplicación.
- **Postman** - Para pruebas de endpoints de la API.

## Instalación

### Requisitos previos

- [Java 11+](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Docker](https://docs.docker.com/get-docker/) (para la ejecución en contenedor)
- [Postman](https://www.postman.com/downloads/) (opcional, para pruebas)

### Configuración Local

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/usuario/facturador-api.git
   cd facturador-api
