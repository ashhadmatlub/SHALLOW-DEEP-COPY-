package PDT;

public class Int2 implements Cloneable {
    private int i;

    public Int2() {
    }

    public Int2(int i) {
        this.i = i;
    }

    public void increment() {
        this.i++;
    }

    @Override
    public String toString() {
        return "" + i;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}