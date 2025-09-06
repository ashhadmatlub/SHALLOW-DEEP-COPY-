package controller.shallow_copy_controller;

import array.shallow_copy.Array;

public class App extends Array {
    public void run() throws CloneNotSupportedException {

        Array arr1 = new Array();
        Array arr2 = (Array) arr1.clone();

        System.out.println("arr1 : " + arr1 + " Before clone ");
        System.out.println("arr2 : " + arr2 + " After clone same copy (Shallow) ");

        // INCREMENT IN arr2
        arr2.increment();
        System.out.println("arr2 : " + arr2);

        // ** SEE IF IT CHAGES ARR1 ELEMENTS AND DATA ITEMS : ANS - > YES IT CHANGES
        System.out.println(
                "arr1 : " + arr1
                        + " Now here we can see the chnages we made in arr2 is reflecting in an array 1 also due to shallow copy ");

        // System.out.println("After changing the value");
        // arr2.setAnArray(0, 210);
        // System.out.println(arr2);

        // System.out.println(" Before cloning value PDT "); // primitve data type
        // arr1.setValue(100);
        // System.out.println(arr1);

        // System.out.println(arr); // this will return the simple array
        // arr.increment();

        // System.out.println(arr); // this returns the incremneted one
    }
}
