# Taller de de modularización con virtualización e Introducción a Docker y a AWS

> En este taller se da introducción al manejo de docker tanto localmente como en instancias de EC2.

> La maquina virtual alojada en AWS:


> *ec2-54-161-227-107.compute-1.amazonaws.com*

### Pre-requisitos

- [Maven](https://maven.apache.org/) : Con esta herramienta se creo la estructura del proyecto y se manejan las dependencias que se necesitan

- [Git](https://git-scm.com/) : Sistema distribuido de manejo de versiones que usaremos tanto en este taller como en lo que resta del curso

Cabe resaltar que es importante que las versiones del JDK de java sean las requeridas para poder instalar
maven ya que si no es actual no se puede instalar las versiones actuales de maven y esto puede desencadenar en problemas
al momento de usar la herramienta.
¿Como revisar la version del JDK?

```
java -version 
```

### Instalación

Para poder instalar el programa debe clonar el repositorio en su maquina local, ejecutando el siguiente comando
en la linea de comandos:

```
https://github.com/cvillamiljr/LAB02-AREP.git
```
### Ejecución
- Previo a la ejecución del proyecto debe empaquetar el proyecto.
- Una vez dentro de la carpeta proceda a ejecutar el siguiente comando para empaquetar el proyecto:
```
mvn package
```
- Ya que el proyecto esta empaquetado, proceda a ejecutar el proyecto usando el siguiente comando:
```
java -cp target/SparkDocker-1.0-SNAPSHOT.jar edu.escuelaing.arep.LogService
```
Nota: Recuerde que -cp hace referencia al classpath de la clase que se va a ejecutar, en este caso es la clase SparkWeb.

- Es importante mencionar que para poder acceder a la visualiazación de la applicación debemos hacerlo de la siguiente manera:
```
localhost:34000
```
- De esta forma podremos ver el funcionamiento de nuestra aplicación de manera local sin necesidad de usar una herramienta de despliegue.


## Construido con

Este proyecto se llevo a cabo con la ayuda de las siguientes herramientas:
- [Spark](http://sparkjava.com/) : Spark - Un micro framework para crear aplicaciones web en Kotlin y Java 8 con el mínimo esfuerzo
- [Maven](https://maven.apache.org/) : Herramienta para la creacion de la estructura del proyecto y el manejo de las dependencias en el mismo.
- [Git](https://git-scm.com/) : Sistema distribuido de manejo de versiones que usaremos tanto en este taller como en lo que resta del curso
- [CircleCi](https://circleci.com/) : Herramienta para realizar integracion continua [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/cvillamiljr/Taller5)

## Author 

- [Cesar Villamil Ramos](https://github.com/cvillamiljr)

## Lincencia

- Este proyecto esta licenciado por GNU General Public License v3.0 .



