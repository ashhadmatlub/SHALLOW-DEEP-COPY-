package controller.deep_copy_controller;

// --------------------- DEEP COPY ARRAY CONTROLLER 

import array.deep_copy.ArrayDeep;

public class AppDeep extends ArrayDeep {
    public void runDeepCopy() throws CloneNotSupportedException {

        ArrayDeep array1 = new ArrayDeep();
        ArrayDeep array2 = (ArrayDeep) array1.clone(); // type casting then refrence variable name of
        // the cloning object then call clone method

        System.out.println("Array value before cloning ( array 1 ) : " + array1);
        System.out.println("Array value after  cloning ( array2 ) :" + array2); // here we are simply printing
        // the objects after cloning

        // NOW WE ARE CHECKING OUR DEEP COPY BY CHANGING THE VALUE

        array2.increment();
        System.out.println("After changes : in ( array 2 ) : " + array2);

        // NOW CHECKING IF THE CHANGES WE MADE IN ARRAY 2 REFLECT IN ARRAY 1 ALSO ?
        System.out.println(
                "After changes in array 2 we are checking that does our Deep Copy works perfectly ? Is our changes in array 2 reflect in ( array 1 ) : "
                        + array1);

        // this perfectly works and also makes the deep copy
    }
}
