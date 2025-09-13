package controller;

import java.util.Iterator;

import PDT.*;
import array.*;

public class control {
    public void run() {
        try {
            Int2 x = new Int2(10);
            Int2 x2 = (Int2) x.clone();

            x2.increment();

            System.out.println("Int2 Original : x1 = " + x);
            System.out.println("Int2 Copy : x2 = " + x2);

            Int3 x3 = new Int3(7); // creating original object
            x3 = (Int3) x3.clone(); // removing the original and creating a copy and changing that
            // copy into original , and origibnal is lost now.
            System.out.println("Int3 : x3 = " + x3);

            // -------------- Array -----------------
            // For Array
            Array array = new Array();
            for (int i = 0; i < 10; i++) {
                array.add(new Int2(i));
            }
            System.out.println("Array1 : " + array);

            // For Array 2
            Array array2 = (Array) array.clone();
            System.out.println("Array2 : copy of Array1 : " + array2);

            // cloning each element of Array1
            for (int i = 0; i < array.size(); i++) {
                array2.set(i, ((Int2) array2.get(i).clone()));
            }

            // ITERATOR
            // Changing the value of all array2 elements
            // for (Iterator e = array2.iterator(); e.hasNext();) {
            // ((Int2) e.next()).increment();
            // }

            // FOR LOOP
            // using for loop instead of iterator to check if it works or not
            for (int i = 0; i < array2.size(); i++) {
                Int2 j = ((Int2) array2.get(i));
                j.increment();
                array2.set(i, j);
            } // this loop successfully works

            // Now checking if it changes the elements of array1 ?
            System.out.println("Array 1 after cloning and changes in Array 2 :" + array);
            System.out.println("Array 2 after changes : " + array2);
            // No changes were reflected in array1 due to deep copy .

            // Note : Here we have used typecasting many times for the conversion of
            // DataType

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

