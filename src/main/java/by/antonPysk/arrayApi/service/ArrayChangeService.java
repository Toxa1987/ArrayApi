package by.antonPysk.arrayApi.service;

import by.antonPysk.arrayApi.entity.Array;
import by.antonPysk.arrayApi.exception.IncorrectConditionException;

public class ArrayChangeService <T extends Comparable> {

    public ArrayChangeService() {
    }
    public  void changeElements (Array array, String condition , T whatChange  , T ch ) throws IncorrectConditionException {
        if  (condition.equals("<")|condition.equals(">")|condition.equals("=") ) {
            T[] tempArray = (T[]) array.getArray();
            int comp = -2;
            if (condition.equals("<")) {
                comp = -1;
            }
            if (condition.equals(">")) {
                comp = 1;
            }
            if (condition.equals("=")) {
                comp = 0;
            }
            for (int i = 0; i < tempArray.length; i++) {
                if (tempArray[i].compareTo(whatChange) == comp) {
                    tempArray[i] = ch;
                }
            }
            array.setArray((Number[]) tempArray);
        }
        if  (condition.equals("<=")|condition.equals(">=")|condition.equals("!=") ) {
            T[] tempArray = (T[]) array.getArray();

            if (condition.equals("<=")) {
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i].compareTo(whatChange) == -1 || tempArray[i].compareTo(whatChange) == 0) {
                        tempArray[i] = ch;
                    }
                }
            }
            if (condition.equals(">=")) {
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i].compareTo(whatChange) == 1 || tempArray[i].compareTo(whatChange) == 0) {
                        tempArray[i] = ch;
                    }
                }
            }
            if (condition.equals("!=")) {
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i].compareTo(whatChange) != 0 ) {
                        tempArray[i] = ch;
                    }
                }
            }
            array.setArray((Number[]) tempArray);
        }
        else throw  new IncorrectConditionException();
    }
}
