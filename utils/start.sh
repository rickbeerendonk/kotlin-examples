#! /bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
filename=$1

clear

if [[ $filename == *.kts ]]; then
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc" "-script" "$filename"
elif [[ $filename == *.kt ]]; then
    echo Compile...
    sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc-jvm" "$filename" "-include-runtime" "-d" "temp/app.jar"
    clear
    java -jar temp/app.jar
fi