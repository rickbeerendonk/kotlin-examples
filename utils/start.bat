@echo off

:: Enable delayed expansion to handle variables within loops or conditions
setlocal enabledelayedexpansion

:: Set the script directory
set "SCRIPT_DIR=%~dp0"
set "FILE=%~1"
set "FILE_DIR=%~2"

:: Debugging: Echo the received paths
echo SCRIPT_DIR: "%SCRIPT_DIR%"
echo FILE: "%FILE%"
echo FILE_DIR: "%FILE_DIR%"

:: Check if file and directory exist
if not exist "%FILE%" (
    echo Error: The specified file does not exist.
    exit /b 1
)

if not exist "%FILE_DIR%" (
    echo Error: The specified directory does not exist.
    exit /b 1
)

:: Clear screen
cls

:: Check file extension
if "%FILE:~-4%" == ".kts" (
    echo [INFO] Script detected
    echo.

    :: Execute Kotlin script
    "%SCRIPT_DIR%kotlinc\bin\kotlinc.bat" -script "%FILE%"
) else if "%FILE:~-3%" == ".kt" (
    echo [INFO] Kotlin JVM file detected
    echo.

    :: Compile Kotlin file
    set "COMPILED_FILE=%SCRIPT_DIR%temp\app.jar"
    "%SCRIPT_DIR%kotlinc\bin\kotlinc-jvm.bat" -cp "%SCRIPT_DIR%lib\kotlinx-coroutines-core-jvm-1.9.0.jar" "%FILE%" -include-runtime -d "%COMPILED_FILE%"
    
    if exist "%COMPILED_FILE%" (
        :: Automatically detect the main class
        for /f "tokens=*" %%i in ('jar tf "%COMPILED_FILE%" ^| findstr /r /c:"MainKt\.class$"') do (
            set "MAIN_CLASS=%%i"
        )
        set "MAIN_CLASS=!MAIN_CLASS:.class=!"
        set "MAIN_CLASS=!MAIN_CLASS:/=.!"

        echo Running main class: !MAIN_CLASS!
        
        :: Run the compiled Kotlin program
        java -cp "%SCRIPT_DIR%lib\*;%COMPILED_FILE%" !MAIN_CLASS!
        
        :: Remove the temporary compiled file
        del "%COMPILED_FILE%"
    ) else (
        echo Error: Failed to compile the Kotlin file.
        exit /b 1
    )
) else (
    echo Error: Unsupported file type. Only .kts and .kt files are supported.
    exit /b 1
)
