package array.shallow_copy;

// --------------- SHALLOW COPY FOR REFERENCE / MUTABLE / ADT 

import java.util.Arrays;

public class Array implements Cloneable {
    private int[] anArray = { 1, 2, 3, 4, 5, 6 }; // [ refrence / mutable / Abstract Data Type ]
    // mutable means it can extends

    // private int value = 0; // [ immutable / primitive data type / value type ]

    // SETTERS
    // public void setAnArray(int i, int j) {
    //     value = i;
    //     anArray[i] = j;
    // }

    // public void setValue(int val) {
    // value = val;
    // }

    // increment method
    public void increment() {
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = anArray[i] + 1;
            // value++;
        }
    }

    @Override
    public String toString() {

        return " This is an array " + Arrays.toString(anArray) ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
