#! /bin/bash -v

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
filename=$1

if [[ $filename == *.kts ]]; then
  sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc" "-script" "$filename"
elif [[ $filename == *.kt ]]; then
  sh "$SCRIPT_DIR/../kotlinc/bin/kotlinc-jvm" "$filename" "-include-runtime" "-d" "temp/app.jar"
  java -jar temp/app.jar
fi