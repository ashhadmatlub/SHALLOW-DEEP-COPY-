package value;

// ------------------ Value Type / Immutable / PDT ( Primitive DataType )

public class Value implements Cloneable {
    private int number;
    private String name;

    public Value(int Number, String Name) {
        number = Number;
        name = Name;
    }

    // Changing the Values
    public void setValues(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + " got " + number + "% in 10th class ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
