# Start with a base image containing Java 16
FROM adoptopenjdk/openjdk16:alpine-jre

# Set the working directory to /app
WORKDIR /app

# Copy the Gradle files to the container
COPY build.gradle gradlew gradlew.bat settings.gradle /app/

# Copy the source code to the container
COPY src /app/src

# Run Gradle to download dependencies and build the project
RUN ./gradlew build

# Set the entry point to run the built JAR file
ENTRYPOINT ["java", "-jar", "/app/build/libs/your-jar-file.jar"]
