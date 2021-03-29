package by.anton.arrayapi.service;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.service.impl.ArraySortService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortServiceTest {
    ArraySortService arraySortService = new ArraySortService();
    private final int[] expectedArray = {-5, 0, 1, 2, 3, 6};

    @Test
    public void bubbleSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        arraySortService.bubbleSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test
    public void quickSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        arraySortService.quickSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test
    public void shellSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        arraySortService.shellSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForShellSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray();
        arraySortService.shellSort(arrayForSort);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForBubbleSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray();
        arraySortService.bubbleSort(arrayForSort);
    }

    @Test(expectedExceptions = ApiException.class)
    public void nullArrayForQuickSortTest() throws ApiException {
        CustomArray arrayForSort = new CustomArray();
        arraySortService.quickSort(arrayForSort);
    }
}
