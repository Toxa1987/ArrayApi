package by.antonPysk.entity;

public class Array {
    private int[] array ;


    public Array() {
    }

    public Array(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int a:array
        ) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}
