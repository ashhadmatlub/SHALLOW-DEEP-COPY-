package vector;

import java.util.ArrayList;
import java.util.List;

public class Vector implements Cloneable {

    private List<Double> axes = new ArrayList<>();

    public Vector() {

    }

    // 2D Vector
    public Vector(Double i, Double j) {
        axes.add(i);
        axes.add(j);
    }

    // 3D Vector
    public Vector(Double i, Double j, Double k) {
        axes.add(i);
        axes.add(j);
        axes.add(k);
    }

    // setters and getters
    public void setAxes(int i, Double value) {

        if (i > axes.size()) {
            System.out.println("This index does not exist, so the value is turned out to be at last index ");

            i = axes.size() - 1;
        }
        axes.set(i, value);
    }

    public Double getAxes(int i) {
        return axes.get(i);
    }

    // method for length
    public int length() {
        return axes.size();
    }

    // Method to match dimensions
    // A 2D vector is extended to 3D by adding 0 as third component

    private void matchDimensions(Vector other) {
        if (this.length() != other.length()) {
            if (this.length() > other.length()) {
                for (int i = other.length(); i < this.length(); i++) {
                    other.axes.add(0.0);
                }
            } else {
                for (int i = this.length(); i < other.length(); i++) {
                    this.axes.add(0.0);
                }
            }
        }
    }

    // Method for addition

    public Vector add(Vector other) {

        matchDimensions(other); // for making the dimensions same

        Vector added = new Vector();

        for (int i = 0; i < this.length(); i++) {
            added.axes.add(i, (this.getAxes(i) + other.getAxes(i)));
        }

        return added;
    }

    // Method for dotProduct

    public double dotProduct(Vector other) {

        matchDimensions(other); // for making the dimensions same

        double product = 0.0;
        for (int i = 0; i < this.length(); i++) {
            product += this.getAxes(i) * other.getAxes(i);
        }

        return product;
    }

    // Method for cross Product
    public Vector crossProduct(Vector other) {

        if (this.length() == 3 && other.length() == 3) {

            Vector cross = new Vector();
            double cros;

            cros = (this.getAxes(1) * other.getAxes(2)) - (this.getAxes(2) * other.getAxes(1));
            cross.axes.add(cros);

            cros = -((this.getAxes(0) * other.getAxes(2)) - (this.getAxes(2) * other.getAxes(0)));
            cross.axes.add(cros);

            cros = (this.getAxes(0) * other.getAxes(1)) - (this.getAxes(1) * other.getAxes(0));
            cross.axes.add(cros);

            return cross;

        } else {
            throw new IllegalArgumentException("Cross Product for only 3D Vectors ");
        }

    }

    // Method to check Equality
    public boolean equal(Vector other) {

        if (this.axes.equals(other.axes)) {
            return true;
        } else {
            return false;
        }

    }

    // cloning for method
    public Object clone() throws CloneNotSupportedException {

        // For Deep Copy
        Vector vect = new Vector();
        vect.axes = new ArrayList<>(this.axes);
        return vect;

        // For Shallow Copy
        // return super.clone();
    }

    public String toString() {
        return axes.toString() +
                " , Vector length : " + length();
    }
}
