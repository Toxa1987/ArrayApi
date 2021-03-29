package by.anton.arrayapi.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        int[] cloneArray = Arrays.copyOf(array, array.length);
        return cloneArray;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public boolean isEmpty(){
        if(array==null){return true;}
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int a : array
        ) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}
