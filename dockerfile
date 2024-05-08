# Use a base image with Java installed
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Java application JAR file into the container
COPY Main.java /app

# Specify the command to run your Java application
CMD ["java", "Main"]
