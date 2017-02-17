#!/bin/bash
JAVA_HOME=/cygdrive/c//Programmes/Java/jdk1.8.0_112/
INCLUDES="-I$JAVA_HOME/include/ -I$JAVA_HOME/include/win32/"


rm -f *Item.java *.o *.dll swigpoc* \
&& swig -java poc.i \
&& x86_64-w64-mingw32-gcc.exe -c poc.c poc_wrap.c $INCLUDES \
&& x86_64-w64-mingw32-gcc.exe $INCLUDES -shared -o poc.dll poc_wrap.o poc.o \
&& $JAVA_HOME/bin/javac *.java && $JAVA_HOME/bin/java PocExample
