# Seguridad con Spring Boot y MongoDB

Este proyecto es un ejemplo de una aplicación Spring Boot que integra seguridad con Spring Security y persistencia en MongoDB. Se implementan roles distintos (`USER` y `ADMIN`) para proteger rutas con autenticación básica HTTP.

---

## Tecnologías utilizadas

- Java 17
- Spring Boot 3.5.3
- Spring Security 6.1.x
- MongoDB (Atlas o local)
- Maven
- Lombok

---

## Requisitos previos

- Tener instalado Java 17 o superior
- Tener Maven instalado
- Tener MongoDB corriendo (local o Atlas)
- Docker instalado (opcional, para levantar MongoDB local)

---

## Levantar MongoDB local con Docker (opcional)

Si quieres levantar MongoDB localmente, ejecuta:

```bash
docker run -d -p 27017:27017 --name mongo-container mongo
```
