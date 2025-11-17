# Use stable Java 17 image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory
WORKDIR /app
# Copy your Spring Boot jar into the container

COPY target/*.jar app.jar

# Expose the app port (example 8082)
EXPOSE 8082

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
