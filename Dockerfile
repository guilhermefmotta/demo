# Use a imagem base do Java
FROM openjdk:20-jdk-slim

# Copie o arquivo JAR da aplicação para o contêiner
COPY target/demo-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

# Defina o comando de inicialização da aplicação
CMD ["java", "-jar", "/app.jar"]