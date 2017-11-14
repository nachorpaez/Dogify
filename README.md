# Dogify
Descargar e instalar el JDK de java http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Configurar la variable de entorno jAVA_HOME en las variables de entorno (windows/linux)

Descargar e instalar mysql server
- Crear una base de datos para la aplicación y generar los permisos para el usuario de la aplicación, para esto se puede correr las siguientes sentencias en el mysql workbench (usuario root), o el cliente mysql de consola

CREATE DATABASE dogify;

CREATE USER ‘dogify’@’localhost’ identified by ‘dogify’;

GRANT ALL ON dogify.* TO ‘dogify’@’localhost’;


Desde la Terminal desde linux, o el “Command Prompt”/cmd para el caso de windows, ingresar en el directorio raiz del proyecto descomprimido

Ingresar por consola para generar el ejecutable a partir del proyecto
“mvnw clean install”

Ingresar por consola a continuación el siguiente comando, para ejecutar la aplicación:
java -jar target/main-app-0.0.1.jar

Una vez que se vea el mensaje similar a “Started TPConfiguration in XX.XXX seconds (JVM running for YY.YYY)” por pantalla, la aplicación estará corriendo y podrá usarse

Puede hacerse requests a la aplicación con algún cliente rest usando la url 
http://localhost:8080/tarifador/tarifar

Este endpoint acepta request REST que usan el método POST, y cuyo body contiene el json con la estructura de datos ya definida

Para detener la aplicación, pulsar Ctrl+C

En el archivo request.http esta el json que nos manda el módulo Paseo
