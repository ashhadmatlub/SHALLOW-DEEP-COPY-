package app;

// ------------------ Value Type / Immutable / PDT ( Primitive DataType )

import value.Value;

public class App {
    public void run() throws CloneNotSupportedException {

        // FROM HERE WE HAVE CONCLUDED THAT :
        // we cannot make a shallow copy of a primitive directly, because primitives are
        // always copied by value.

        Value val1 = new Value(70, "Ahmed");
        Value val2 = (Value) (val1).clone();

        System.out.println("Value 1 : " + val1);
        System.out.println("Value 2 : " + val2);

        // After Changing the Value 2
        val2.setValues(80, "Amir");
        System.out.println("Update value 2 : " + val2);

        // Now seeing the whether the changes reflects on Value or not
        System.out.println("After Value 2 is been updated , Value 1 :" + val1); // no effects on val1

        // After the execution of the Above line it is clearly visible that if we use
        // clone method then it will clearly make a Deep copy because it is a ( PDT / ,
        // However for an ADT this method will only make a Shallow copy of that object

    }
}
