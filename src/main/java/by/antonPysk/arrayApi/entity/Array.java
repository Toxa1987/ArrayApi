package by.antonPysk.arrayApi.entity;

public class Array <T extends Number> {
    private T[] array ;


    public Array() {
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T a:array
             ) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}
