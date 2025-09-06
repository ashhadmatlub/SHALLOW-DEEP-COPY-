package array.deep_copy;

import java.util.Arrays;

// ---------------------------- THIS IS FOR DEEP COPY OF REFERENCE TYPE / MUTABLE / ADT

public class ArrayDeep implements Cloneable {
    private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

    public void increment() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public String toString() {
        return "Array : " + Arrays.toString(array);
    }

    public Object clone() throws CloneNotSupportedException {
        // Deep copy cloning method
        ArrayDeep clone = new ArrayDeep();
        clone.array = array.clone();
        return clone;

        // SHALLOW COPY CLONE METHOD
        // return super.clone();
    }
}
