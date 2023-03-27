@echo off

set SCRIPT_DIR=%~dp0
set FILE=%1
set FILE=%FILE:"=%
set FILE_DIR=%2
set FILE_DIR=%FILE_DIR:"=%

rem Clear terminal
cls

if "%FILE:~-4%" == ".kts" (
    rem Script
    echo script

    rem Show compiler version
    rem call "%SCRIPT_DIR%\kotlinc\bin\kotlinc" -version
    echo.

    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc" "-script" "%FILE%"
) else if "%FILE:~-3%" == ".kt" (
    rem JVM
    echo jvm

    rem Show compiler version
    rem call "%SCRIPT_DIR%\kotlinc\bin\kotlinc-jvm" -version
    echo.

    set COMPILED_FILE="temp\\app.jar"
    echo %FILE%
    echo %COMPILED_FILE%

    call "%SCRIPT_DIR%\kotlinc\bin\kotlinc-jvm" -cp "%SCRIPT_DIR%\lib\*" "%FILE_DIR%" "-include-runtime" "-d" "%COMPILED_FILE%"
    if exist "%COMPILED_FILE%" (
        cls
        rem Works for coroutine examples (without main in a package):
        rem java -cp "%SCRIPT_DIR%\lib\*";"%COMPILED_FILE%" MainKt 
        java -jar "%COMPILED_FILE%"
        del "%COMPILED_FILE%"
    )
)
