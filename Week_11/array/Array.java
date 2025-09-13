package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import PDT.Int2;

public class Array implements Cloneable, Iterable<Int2> {

    private List<Int2> array = new ArrayList<>();

    public Array() {
    }

    // setters and getters
    public void set(int index, Int2 value) {
        array.set(index, value);
    }

    public Int2 get(int i) {
        return array.get(i);
    }

    // Method to add the values in Array which is of Int2 ( ADT )
    public void add(Int2 i) {
        array.add(i);
    }

    // making the size method to determine the length / size of an array
    public int size() {
        return array.size();
    }

    // clone method
    public Object clone() throws CloneNotSupportedException {
        Array clone = new Array();
        clone.array = new ArrayList<>(this.array);
        return clone;

    }

    // toString
    public String toString() {
        return array.toString();
    }

    // iterator
    @Override
    public Iterator<Int2> iterator() {
        return array.iterator();
    }

}
