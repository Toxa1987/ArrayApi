package by.antonPysk;

import by.antonPysk.arrayApi.entity.Array;
import by.antonPysk.arrayApi.exception.IncorrectConditionException;
import by.antonPysk.arrayApi.service.ArrayCalculateService;
import by.antonPysk.arrayApi.service.ArrayChangeService;
import by.antonPysk.arrayApi.service.ArrayFindService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    static Logger logger = LogManager.getLogger();
    public static void main( String[] args ) {
        Integer[] i = {1, 2, -3, 4, 5};
        Array<Integer> ar = new Array<>();
        ar.setArray(i);
        ArrayCalculateService arrayService = new ArrayCalculateService();
        System.out.println(arrayService.sumElementsOfArray(ar));
    }
}
