package by.antonPysk.service;

import by.antonPysk.entity.Array;

import java.util.Arrays;

public class ArrayFindService {

    public ArrayFindService() {
    }

    public  int arrayMin (Array array ){
      int [] temp= array.getArray();
        Arrays.sort(temp);
        return  temp[0] ;
    }
    public  int  arrayMax (Array array ){
        int [] temp= array.getArray();
        Arrays.sort(temp);
        return  temp[temp.length-1] ;
    }
    public long negativeNumbersInArray(Array array){
        int[] tempArray =  array.getArray();
        int count=0;
        for (int i = 0; i < tempArray.length ; i++) {
            if (tempArray[i] < 0) count++;
        }
        return count;
    }
    public long positiveNumbersInArray(Array array){
        int[] tempArray =  array.getArray();
        int count=0;
        for (int i = 0; i < tempArray.length ; i++) {
            if (tempArray[i]>0) count++;
        }
        return count;
    }
}
