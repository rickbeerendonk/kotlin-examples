#! /bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
FILE=$1
FILE_DIR=$2

color_off="\033[0m"
blue="\033[0;34m"
bold=$(tput bold)
normal=$(tput sgr0)

# Debugging: Controleer scriptdirectory en library path
echo "Script directory: $SCRIPT_DIR"
echo "Library path: $SCRIPT_DIR/lib"

# Clear terminal
clear

# Static classpath
# LIB_CP="$SCRIPT_DIR/lib/kotlinx-coroutines-core-jvm-1.9.0.jar:$SCRIPT_DIR/lib/kotlinx-datetime-jvm-0.6.1.jar"

# Dynamic classpath
LIB_CP=$(find "$SCRIPT_DIR/lib" -name '*.jar' | tr '\n' ':')

if [[ $FILE == *.kts ]]; then
    # Script
    echo "${blue}${bold}info:${normal}${color_off} script"
    # Show compiler version
    #sh "$SCRIPT_DIR/kotlinc/bin/kotlinc" -version
    echo

    sh "$SCRIPT_DIR/kotlinc/bin/kotlinc" "-script" "$FILE"
elif [[ $FILE == *.kt ]]; then
    # JVM
    echo "${blue}${bold}info:${normal}${color_off} jvm"
    # Show compiler version
    #sh "$SCRIPT_DIR/kotlinc/bin/kotlinc-jvm" -version
    echo

    COMPILED_FILE=temp/app.jar

    # Compile using classpath
    sh "$SCRIPT_DIR/kotlinc/bin/kotlinc-jvm" \
        -cp "$LIB_CP" \
        "$FILE_DIR" "-include-runtime" "-d" "$COMPILED_FILE"
    
    if [[ -f "$COMPILED_FILE" ]]; then
        # Automatically detect the main class
        MAIN_CLASS=$(jar tf "$COMPILED_FILE" | grep 'MainKt\.class$' | sed 's/\.class$//' | tr '/' '.')

        # Run the compiled app
        java -cp "$LIB_CP:$COMPILED_FILE" "$MAIN_CLASS"
        rm "$COMPILED_FILE"
    fi
fi
