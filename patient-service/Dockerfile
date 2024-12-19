# Utiliser une image de base avec OpenJDK 11
FROM openjdk:11-jre-slim

# Définir des variables d'environnement pour le conteneur
ENV APP_HOME=/app
ENV JAVA_OPTS="-Xms512m -Xmx1g"

# Créer le répertoire de l'application
WORKDIR $APP_HOME

# Copier le fichier JAR dans le conteneur
COPY target/patient-service-0.0.1-SNAPSHOT.jar $APP_HOME/app.jar

# Exposer le port sur lequel l'application s'exécute
EXPOSE 8081

# Commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
