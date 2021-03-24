package by.antonPysk;

import by.antonPysk.entity.Array;
import by.antonPysk.exception.IncorrectConditionException;
import by.antonPysk.service.ArrayChangeService;
import by.antonPysk.service.ArrayFindService;
import by.antonPysk.service.ArraySortService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Array array= new Array(new int[] {9,2,0,-5,7,43,-9,1,7,45,3,0,0});
        ArrayFindService arrayFindService=new ArrayFindService();
        System.out.println(arrayFindService.negativeNumbersInArray(array));
        System.out.println(arrayFindService.positiveNumbersInArray(array));
        ArrayChangeService arrayChangeService=new ArrayChangeService();
        ArraySortService arraySortService=new ArraySortService();
        arraySortService.quickSort(array);
        System.out.println(array.toString());

    }
}
