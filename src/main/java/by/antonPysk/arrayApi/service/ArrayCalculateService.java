package by.antonPysk.arrayApi.service;

import by.antonPysk.arrayApi.entity.Array;

public class ArrayCalculateService  {
    public ArrayCalculateService() {
    }
    public <T extends Number> long sumElementsOfArray(Array array){
        Number[] tempArray = (Number[]) array.getArray();
        Long sum=(Long)0;
        for (int i = 0; i <tempArray.length ; i++) {
            sum+=tempArray[i];
        }
        return sum;
    }
    public long averageOfArray(Array array){
        T[] tempArray = (T[]) array.getArray();
        return sumElementsOfArray(array)/tempArray.length;
    }
}
