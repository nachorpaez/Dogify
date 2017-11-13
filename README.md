# Dogify
Seguir esta guia para instalar lo necesario (Gradle) http://spring.io/guides/gs/spring-boot/

Crear usuario dogify en MySql y darle los permisos necesarios

create user 'dogify'@'localhost' identified by 'dogify';

GRANT ALL ON dogify.* to 'dogify'@'localhost';

Para levantar el sistema ejecutar en la carpeta de la aplicación: ./gradlew clean build && java -jar build/libs/gs-actuator-service-0.1.0.jar

En el archivo request.http esta el json que nos manda el módulo Paseo
