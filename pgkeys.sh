#!/bin/bash

ANTLR=/usr/local/lib/antlr-4.9-complete.jar

if [ -z "$1" ]; then
    echo "Usage:"
    echo " -compile  Compile the PGKeys grammar"
    echo " -tree FILE   Show the parse tree in GUI. FILE contains PG-Keys syntax"
    echo " -ps FILE   Create PostScript image. FILE contains PG-Keys syntax"
    echo ""
    echo "Example:"
    echo " $0 -tree ./examples/01.pgs"
else 
    if [ $1 = "-compile" ]; then
        java -jar $ANTLR ./src/PGKeys.g4
        javac ./src/PGKeys*.java
    elif [ $1 = "-tree" ]; then
        if [ -z "$2" ]; then
            echo "Add the file name."
        else 
            cd src
            java org.antlr.v4.gui.TestRig PGKeys pgkeys -gui ../$2
        fi
    elif [ $1 = "-ps" ]; then
        if [ -z "$2" ]; then
            echo "Add the file name."
        else 
            cd src
            NAME="$(basename $2 .pgk)"
            echo $NAME.ps created
            java org.antlr.v4.gui.TestRig PGKeys pgkeys ../$2 -ps ../images/$NAME.ps
        fi
    fi
fi
