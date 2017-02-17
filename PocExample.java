public class PocExample {

  static {
    System.out.println("load poc ...");
    System.loadLibrary("poc");
    System.out.println("load poc ... OK ");
  }

  public static void  main(String args[]) {
    System.out.println("poc");

    System.out.println("sumitems:");
    int[] arrayB = new int[10000000];          // Array of 10-million integers
    for (int i=0; i<arrayB.length; i++) {      // Set some values
      arrayB[i] = i;
    }
    int sum = swigpoc.sumitems(arrayB, 10000);
    System.out.println("SumB = " + sum);


    System.out.println("MyItem:");
    MyItem myt = new MyItem();
    swigpoc.populateSampleItem(myt);
    System.out.println("myt.name = " + myt.getName());

    MyItems myts = new MyItems();
    myts.setCount(10);
    swigpoc.populateItems(myts);

    for (int j=0; j<myts.getCount(); j++) {
      System.out.println(String.format("myts.element[%d].name = '%s'",j, myts.getElement(j).getName()));
      System.out.println(String.format("myts.element[%d].id = '%s'"  ,j, myts.getElement(j).getId()));
    }


    MyItems rez = swigpoc.buildItems();
    for (int k=0; k<rez.getCount(); k++) {
      System.out.println(String.format("rez.element[%d].name = '%s'",k, rez.getElement(k).getName()));
      System.out.println(String.format("rez.element[%d].id = '%s'"  ,k, rez.getElement(k).getId()));
    }
  }
}