#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "poc.h"

int sumitems(int *first, int nitems) {
  int i, sum = 0;
  for (i = 0; i < nitems; i++) {
    sum += first[i];
  }
  return sum;
}

void populateSampleItem(MyItem *item) {
  item->id = 1234;
  item->name = strdup("getSampleItem");
}

void populateItems(MyItems *items) {
    int nb = items->count;
    items->elements = malloc(nb * sizeof(MyItem));
    for (int j=nb-1;j>=0;j--) {
        items->elements[j].id = j;
        char elementName[80];
        sprintf(elementName, "populateItems %d", j);
        items->elements[j].name = strdup(elementName);
    }
}

MyItems *buildItems() {
    printf("buildItems 14 elements");
    int nb = 14;
    MyItems *items= malloc(sizeof(MyItems));;
    items->count = nb;
    items->elements = malloc(nb * sizeof(MyItem));
    for (int j=nb-1;j>=0;j--) {
        items->elements[j].id = j;
        char elementName[80];
        sprintf(elementName, "buildItems %d", j);
        items->elements[j].name = strdup(elementName);
    }
    return items;
}