$JAVA_HOME = "C:\Program Files\Java\jdk-19" # replace with your Java installation path
$PROJECT_DIR = "." # replace with the directory containing your project
$SOURCE = "hello.crpt"

# compile the project with Gradle
& "$PROJECT_DIR\gradlew.bat" build

# run the Main class
& "$JAVA_HOME\bin\java" -cp "$PROJECT_DIR\build\classes\java\main; $PROJECT_DIR\build\resources\main; $PROJECT_DIR\build\libs\*" com.sphere.Main $SOURCE
