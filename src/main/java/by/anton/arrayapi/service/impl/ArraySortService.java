package by.anton.arrayapi.service.impl;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.ArraySortInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService implements ArraySortInterface {
    private final static Logger logger = LogManager.getLogger();

    public void bubbleSort(CustomArray customArray) throws ApiException {
        logger.info("Bubble sort  method called.");
        if (customArray.isEmpty()) {
            throw new ApiException("Array  is null");
        }
        int[] tempArray = customArray.getArray();
        if (tempArray.length < 2) {
            return;
        }
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
        customArray.setArray(tempArray);
    }

    public void quickSort(CustomArray customArray) throws ApiException {
        logger.info("Quick sort  method called.");
        if (customArray.isEmpty()) {
            throw new ApiException("Array  is null");
        }
        int[] tempArray = customArray.getArray();
        logicQuickSort(tempArray, 0, tempArray.length - 1);
        customArray.setArray(tempArray);
    }

    private void logicQuickSort(int[] array, int low, int high) {
        if (array.length < 2) return;
        int middle = low + (high - low) / 2;
        int middleElementOfArray = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < middleElementOfArray) {
                i++;
            }
            while (array[j] > middleElementOfArray) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            logicQuickSort(array, low, j);
        }
        if (high > i) {
            logicQuickSort(array, i, high);
        }
    }

    public void shellSort(CustomArray customArray) throws ApiException {
        logger.info("Shellsort  method called.");
        if (customArray.isEmpty()) {
            throw new ApiException("Array  is null");
        }
        if (customArray.getArray().length < 2) {
            return;
        }
        int[] tempArray = customArray.getArray();
        int step = tempArray.length / 2;
        while (step > 0) {
            for (int i = step; i < tempArray.length; i++) {
                int current = tempArray[i];
                int j = i - step;
                while ((j >= 0 && current < tempArray[j])) {
                    tempArray[j + step] = tempArray[j];
                    j -= step;
                }
                tempArray[j + step] = current;
            }
            step /= 2;
        }
        customArray.setArray(tempArray);
    }
}
