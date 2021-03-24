package by.antonPysk.service;

import by.antonPysk.entity.Array;
import by.antonPysk.exception.IncorrectConditionException;

public class ArrayChangeService {

    public  void changeElements (Array array, String condition , int whatChange  , int ch ) throws IncorrectConditionException {
        int [] tempArray = array.getArray();
        switch (condition){
            case ("<"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] < whatChange) {
                        tempArray[i] = ch;
                    }
                }
                array.setArray(tempArray);
                break;
            case (">"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] > whatChange) {
                        tempArray[i] = ch;
                    }
                }
                    array.setArray(tempArray);
                    break;
            case ("="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] == whatChange) {
                        tempArray[i] = ch;
                    }
                }
                array.setArray(tempArray);
                break;
            case (">="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] >= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                array.setArray(tempArray);
                break;
            case ("<="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] <= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                array.setArray(tempArray);
                break;
            case ("!="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] != whatChange) {
                        tempArray[i] = ch;
                    }
                }
                array.setArray(tempArray);
                break;
            default:
                throw  new IncorrectConditionException();
        }

    }
}
