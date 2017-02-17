%module swigpoc

%include "arrays_java.i";
%apply int[] {int *};

%{
 #include "poc.h"
%}

%include "poc.h";
%extend MyItems_t{
  MyItem * getElement(int i) {
      return &$self->elements[i];
  }
}




