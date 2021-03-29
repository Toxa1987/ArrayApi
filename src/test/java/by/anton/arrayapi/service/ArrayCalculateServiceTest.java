package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.impl.ArrayCalculateService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayCalculateServiceTest {
    ArrayCalculateService arrayCalculateService = new ArrayCalculateService();

    @Test
    public void sumElementsOfArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        int actualSum = arrayCalculateService.sumElementsOfArray(customArray);
        int expected = 16;
        assertEquals(actualSum, expected);
    }

    @Test
    public void averageOfArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        int actualAverage = arrayCalculateService.averageOfArray(customArray);
        int expected = 4;
        assertEquals(actualAverage, expected);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForSumElementsOfArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayCalculateService.sumElementsOfArray(customArray);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForAverageOfArrayTest() throws ApiException {
        CustomArray customArray = new CustomArray();
        arrayCalculateService.averageOfArray(customArray);
    }
}
