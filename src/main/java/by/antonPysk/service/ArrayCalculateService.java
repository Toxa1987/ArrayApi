package by.antonPysk.service;

import by.antonPysk.entity.Array;

public class ArrayCalculateService {
    public ArrayCalculateService() {
    }
    public int sumElementsOfArray(Array array){
        int[] tempArray =  array.getArray();
        int sum=0;
        for (int i = 0; i <tempArray.length ; i++) {
            sum+=tempArray[i];
        }
        return sum;
    }
    public int averageOfArray(Array array){
        int[] tempArray =  array.getArray();
        return sumElementsOfArray(array)/tempArray.length;
    }
}
