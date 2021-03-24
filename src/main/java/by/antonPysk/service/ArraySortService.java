package by.antonPysk.service;

import by.antonPysk.entity.Array;

public class ArraySortService {
    public ArraySortService() {
    }

    public void bubbleSort(Array array) {
        int[] tempArray = array.getArray();
        int temp;
        for (int i = 1; i < tempArray.length; i++) {
            for (int j = tempArray.length - 1; j >= i; j--) {
                if (tempArray[j - 1] > tempArray[j]) {
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setArray(tempArray);
    }

    public void quickSort(Array array){
        int[] tempArray = array.getArray();
        qs(tempArray,0,tempArray.length-1);
        array.setArray(tempArray);
    }

    private void qs(int[] array ,int low , int high ){
        if (array.length==0) return;
        if (low >= high) return;

        int middle=low+(high-low)/2;
        int opor=array[middle];

        int i=low;
        int j=high;

        while (i<=j){
            while (array[i] < opor){
                i++;
            }
            while (array[j] > opor){
                j--;
            }
            if(i<=j){
               int  temp = array[i];
               array[i] = array[j];
               array[j]= temp;
               i++;
               j--;
            }
        }
        if (low < j) qs(array, low, j);
        if (high > i) qs(array, i, high);
    }
}
