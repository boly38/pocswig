# pocswig
Swig proof of concept

You would like to map a C code from your Java application and you have heard about Swig: this poc is for you! 

This poc is a really simple example to understand how to manage (from Java application) a C array of complex structure.

proof of concept sample includes 4 functions:
* a function sumitems that accept an array of integer as parameter to calculate a sum (part of Swig3 documentation)
* a function populateSampleItem that just write on a given simple structure
* a function populateItems that update an existing array of struct
* a function buildItems that create from scratch a result array of struct


Details: cf. http://curiositedevie.blogspot.fr/2017/02/howto-swig-c-to-java-functions-that.html
