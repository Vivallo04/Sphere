#!/bin/bash

# Check if Gradle is installed
if ! command -v gradle &> /dev/null
then
    echo "Gradle is not installed. Aborting script."
    exit 1
fi

# Check if the Gradle build task succeeded
if ! ./gradlew jar
then
    echo "Gradle build task failed. Aborting script."
    exit 1
fi

# Get the current path and set it as the working directory
currentPath=$(pwd)
cd "$currentPath"
echo "Current path: $currentPath"

# Check if the compiled Java program exists
programPath="$currentPath/build/libs/Sphere-1.0.jar"
if [ ! -f "$programPath" ]
then
    echo "Compiled Java program not found. Aborting script."
    exit 1
fi

# Check if the file to pass as a program argument exists
filePath="$currentPath/src/main/resources/hello.sph"
if [ ! -f "$filePath" ]
then
    echo "File to pass as a program argument not found. Aborting script."
    exit 1
fi

# Run the Java program with the file as a program argument
java -jar "$programPath" "$filePath"
