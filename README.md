# 💫 About Me:
🔭 I’m currently working on java<br>💬 Ask me about<br>⚡ Fun fact


## 🌐 Socials:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://linkedin.com/in/https://www.linkedin.com/in/juanriveroalbornoz/) 

# 💻 Tech Stack:
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=JuanpiRiv&theme=dark&hide_border=false&include_all_commits=true&count_private=false)<br/>
![](https://github-readme-streak-stats.herokuapp.com/?user=JuanpiRiv&theme=dark&hide_border=false)<br/>
![](https://github-readme-stats.vercel.app/api/top-langs/?username=JuanpiRiv&theme=dark&hide_border=false&include_all_commits=true&count_private=false&layout=compact)

---
[![](https://visitcount.itsvg.in/api?id=JuanpiRiv&icon=0&color=0)](https://visitcount.itsvg.in)

# Facturador API

Un proyecto de facturación desarrollado en Java que ofrece una API REST para gestionar y consultar facturas. Este proyecto utiliza una base de datos en memoria H2 y puede ejecutarse en un contenedor Docker. Además, cuenta con documentación de API generada con Swagger y se proporcionan pruebas con Postman.

## Características

- CRUD completo para gestión de facturas.
- API REST documentada con Swagger.
- Base de datos en memoria H2 para un entorno liviano.
- Compatible con Docker para una fácil implementación.
- Colección de pruebas en Postman incluida.

## Tecnologías Utilizadas

- **Java** - Versión 17 o superior.
- **Spring Boot** - Framework principal para el desarrollo de la API.
- **H2 Database** - Base de datos en memoria para desarrollo y pruebas.
- **Swagger** - Generación de documentación de la API.
-  **MySQL (opcional)** - Base de datos persistente en Docker.
- **Docker** - Para la creación de contenedores de la aplicación.
- **Postman** - Para pruebas de endpoints de la API.

### Requisitos previos
- [Docker](https://docs.docker.com/get-docker/) (para la ejecución en contenedor)
- [Postman](https://www.postman.com/downloads/) (opcional, para pruebas)

### Configuración con Docker y MySQL
 -Si deseas utilizar Docker para ejecutar la aplicación con MySQL como base de datos, sigue estos pasos adicionales.
 #1.Crear el archivo docker-compose.yml

Crea un archivo docker-compose.yml en la raíz del proyecto con el siguiente contenido:

services:
  db:
    image: mysql:latest
    restart: always
    environment:
      - MYSQL_USER=jp
      - MYSQL_PASSWORD=root
      - MYSQL_ROOT_PASSWORD=root
    ports:
      - "3306:3306"
    volumes:
      - ./mysql_data:/var/lib/mysql



 #2.Actualizar application.properties para MySQL :
 
 DB en Docker
spring.datasource.url=jdbc:mysql://localhost:3306/fact?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

 Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext

 Swagger UI
springdoc.swagger-ui.path=/swagger-ui.html

 Port
server.port=5000


#3. Iniciar el contenedor Docker

Ejecuta el siguiente comando para iniciar MySQL en Docker:

docker-compose up -d



<!-- Proudly created with GPRM ( https://gprm.itsvg.in ) -->
