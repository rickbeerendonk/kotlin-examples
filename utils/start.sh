#! /bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
FILE=$1

clear

if [[ $FILE == *.kts ]]; then
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc" "-script" "$FILE"
elif [[ $FILE == *.kt ]]; then
    echo Compile...
    COMPILED_FILE=temp/app.jar
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc-jvm" "$FILE" "-include-runtime" "-d" "$COMPILED_FILE"
    if [[ -f "$COMPILED_FILE" ]]; then
        clear
        java -jar $COMPILED_FILE
        rm $COMPILED_FILE
    fi
fi