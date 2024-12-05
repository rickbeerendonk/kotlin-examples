@echo off

setlocal enabledelayedexpansion

set SCRIPT_DIR=%~dp0
set FILE=%1
set FILE=%FILE:"=%
set FILE_DIR=%2
set FILE_DIR=%FILE_DIR:"=%

rem Clear terminal
cls

rem Debug output
echo SCRIPT_DIR: %SCRIPT_DIR%
echo FILE: %FILE%
echo FILE_DIR: %FILE_DIR%

if "%FILE:~-4%" == ".kts" (
    rem Script
    echo Running Kotlin script...

    rem Show compiler version
    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc.bat" -version
    echo.

    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc.bat" -script "%FILE%"
) else if "%FILE:~-3%" == ".kt" (
    rem JVM
    echo Compiling Kotlin JVM...

    rem Show compiler version
    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc-jvm.bat" -version
    echo.

    set COMPILED_FILE=%SCRIPT_DIR%temp\app.jar

    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc-jvm.bat" -cp "%SCRIPT_DIR%\lib\*" "%FILE" -include-runtime -d "%COMPILED_FILE%"
    if exist "%COMPILED_FILE%" (
        cls
        rem Works for coroutine examples (without main in a package):
        rem java -cp "%SCRIPT_DIR%\lib\*";"%COMPILED_FILE%" MainKt 
        java -jar "%COMPILED_FILE%"
        del "%COMPILED_FILE%"
    )
)

endlocal
