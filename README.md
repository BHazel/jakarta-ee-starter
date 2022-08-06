# Jakarta EE Starter

This repository contains a basic starter project for a Jakarta EE Web Profile application based on:

* Apache Maven
* Java 11
* Jakarta EE 9.1
* Cargo
* Apache TomEE

## Getting Started

To build the web application, run:

```sh
mvn clean package
```

To deploy to a TomEE server, run:

```sh
mvn clean package cargo:deploy
```

To redeploy, run:

```sh
mvn clean package cargo:undeploy cargo:deploy
```