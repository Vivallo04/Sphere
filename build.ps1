$JAVA_HOME = "C:\Program Files\Java\jdk-19" # replace with your Java installation path
$PROJECT_DIR = "." # replace with the directory containing your project
$SOURCE = "hello.crpt"

# compile the project with Gradle
& "$PROJECT_DIR\gradlew.bat" build

# run the Main class
& "$JAVA_HOME\bin\java" -cp "$PROJECT_DIR\build\classes\java\main; $PROJECT_DIR\build\resources\main; $PROJECT_DIR\build\libs\*" com.sphere.Main $SOURCE

function compile {
    $BN = [System.IO.Path]::GetFileNameWithoutExtension($args[0])
    $TTOUTPUT = & $JAVA $COMPILER $args[0] 2>&1
    if ($LASTEXITCODE -ne 0) {
        Write-Output $TTOUTPUT
    }
    else {
        Move-Item out.c "$BN.c"
        $CCOUTPUT = & $CC -o $BN "$BN.c"
        if ($LASTEXITCODE -ne 0) {
            Write-Output $CCOUTPUT
        }
        else {
            Write-Output $TTOUTPUT
        }
    }
}

if ($args.Length -eq 0) {
    Get-ChildItem *.crpt | ForEach-Object { compile $_.FullName }
}
else {
    compile $args[0]
}