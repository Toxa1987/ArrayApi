package by.anton.arrayapi;

import by.anton.arrayapi.creator.CreateFactory;
import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.parser.impl.StringParser;
import by.anton.arrayapi.reader.impl.DataReader;
import by.anton.arrayapi.service.impl.ArrayFindService;
import by.anton.arrayapi.service.impl.ArraySortService;

import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        CreateFactory createFactory = new CreateFactory();
        CustomArray customArray = new CustomArray();
        /*int[] dada=null;
        try {
            //CustomArray customArray1= createFactory.createCustomArray(dada);
            customArray = createFactory.createCustomArray(new StringParser().parseString(
                    new DataReader().readFile(new File("./src/main/resources/data.txt"))));



        new ArraySortService().shellSort(customArray);
        } catch (ApiException e) {
            System.out.println(e);
        }
       // System.out.println(customArray.toString());

    }
         */
        ArrayFindService arrayFindService=new ArrayFindService();
        try {
            arrayFindService.arrayMin(customArray);
        } catch (ApiException e) {
            System.out.println(e);
        }
    }
}
