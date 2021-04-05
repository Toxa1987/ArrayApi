package by.antonPysk.arrayApi.service;

import by.antonPysk.arrayApi.entity.Array;

public class ArrayFindService<T extends Comparable>  {


    public ArrayFindService(){}

    public  T  arrayMin (Array array ){
        T[] tempArray = (T[]) array.getArray();
        T min = tempArray[0];
        for (int i = 1; i < tempArray.length ; i++) {
            if(tempArray[i].compareTo(min)==-1){
                min= tempArray[i];
            }
        }
        return  min ;
    }
    public  T  arrayMax (Array array ){
        T[] tempArray = (T[]) array.getArray();
        T max = tempArray[0];
        for (int i = 1; i < tempArray.length ; i++) {
            if(tempArray[i].compareTo(max)==1){
                max= tempArray[i];
            }
        }
        return  max ;
    }
    public long negativeNumbersInArray(Array array){
        T[] tempArray = (T[]) array.getArray();
        int count=0;
        for (int i = 0; i < tempArray.length ; i++) {
            if (tempArray[i].compareTo(0)==-1) count++;
        }
        return count;
    }
    public long positiveNumbersInArray(Array array){
        T[] tempArray = (T[]) array.getArray();
        int count=0;
        for (int i = 0; i < tempArray.length ; i++) {
            if (tempArray[i].compareTo(0)==1) count++;
        }
        return count;
    }
}
