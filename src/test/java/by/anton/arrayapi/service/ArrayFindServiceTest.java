package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.impl.ArrayFindService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayFindServiceTest {
    ArrayFindService arrayFindService = new ArrayFindService();

    @Test
    public void minArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{2, 3, 6, 0, -1});
        int actual = arrayFindService.arrayMin(customArray);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    public void maxArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{2, 3, 6, 0, -1});
        int actual = arrayFindService.arrayMax(customArray);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void negativeNumbersInArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{2, -3, 6, 0, -1});
        int actual = arrayFindService.negativeNumbersInArray(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void positiveNumbersInArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{2, -3, 6, 0, -1});
        int actual = arrayFindService.negativeNumbersInArray(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForMinArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayFindService.arrayMin(customArray);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForMaxArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayFindService.arrayMax(customArray);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForNegativeNumbersInArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayFindService.negativeNumbersInArray(customArray);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForPositiveNumbersInArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayFindService.positiveNumbersInArray(customArray);
    }
}
