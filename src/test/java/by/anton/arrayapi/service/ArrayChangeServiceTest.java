package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.exception.IncorrectConditionException;
import by.anton.arrayapi.service.impl.ArrayChangeService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayChangeServiceTest {
    ArrayChangeService arrayChangeService = new ArrayChangeService();

    @Test
    public void changeTest() throws ApiException, IncorrectConditionException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        arrayChangeService.changeElements(customArray, "<", 5, 0);
        int[] actual = customArray.getArray();
        int[] expected = new int[]{0, 0, 5, 6};
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForChangeServiceTest() throws ApiException, IncorrectConditionException {
        CustomArray customArray = new CustomArray();
        arrayChangeService.changeElements(customArray, "<", 5, 0);
    }

    @Test(expectedExceptions = IncorrectConditionException.class)
    public void nullArrayForAverageOfArrayTest() throws ApiException, IncorrectConditionException {
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        arrayChangeService.changeElements(customArray, "!", 5, 0);
    }
}
