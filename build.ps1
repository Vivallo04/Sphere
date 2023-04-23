$currentPath = (Get-Location).Path
Set-Location $currentPath
Write-Host "Current path: $currentPath"

# Run the Gradle build task to compile your Java program
.\gradlew jar

# Define the path to the compiled Java program (replace "example.jar" with the name of your program)
$programPath = $currentPath + "\build\libs\Sphere-1.0.jar"

# Define the path to the file you want to pass as a program argument (replace "example.txt" with the name of your file)
$filePath = $currentPath + "\src\main\resources\hello.sph"

# Run the Java program with the file as a program argument
& java -jar $programPath $filePath