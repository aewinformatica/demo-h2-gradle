# demo-h2-gradle
Simple app using h2 DB and Gradle

### Dockerizando

Criando o Dockerfile:

```
FROM openjdk:17-jdk-alpine
COPY  build/libs/*.jar /demo.jar
CMD ["java", "-jar", "/demo.jar"]
```


Gerando o jar

```
./gradlew build
```

Entre na raiz do projeto e execute o comando a seguir:

```
docker build -t myapp .
```

Executando o Projeto no Docker

```
docker run -p 8080:8080 myapp
```

