#! /bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
FILE=$1
FILE_DIR=$2

color_off="\033[0m"
blue="\033[0;34m"
bold=$(tput bold)
normal=$(tput sgr0)

# Clear terminal
clear

if [[ $FILE == *.kts ]]; then
    # Script
    echo "${blue}${bold}info:${normal}${color_off} script"
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc" -version
    echo

    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc" "-script" "$FILE"
elif [[ $FILE == *.kt ]]; then
    # Java
    echo "${blue}${bold}info:${normal}${color_off} java"
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc-jvm" -version
    echo

    COMPILED_FILE=temp/app.jar
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc-jvm" "$FILE_DIR" "-include-runtime" "-d" "$COMPILED_FILE"
    if [[ -f "$COMPILED_FILE" ]]; then
        clear
        java -jar $COMPILED_FILE
        rm $COMPILED_FILE
    fi
fi