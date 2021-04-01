package by.anton.arrayapi;

import by.anton.arrayapi.creator.impl.CreateFactory;
import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.exception.IncorrectConditionException;
import by.anton.arrayapi.parser.impl.StringParser;
import by.anton.arrayapi.reader.impl.DataReader;
import by.anton.arrayapi.service.impl.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      DataReader dataReader = new DataReader();
        CreateFactory createFactory = new CreateFactory();
        CustomArray customArray = new CustomArray();
        int[] dada=null;
        try {
            //CustomArray customArray1= createFactory.createCustomArray(dada);
            customArray = createFactory.createCustomArray(new StringParser().parseString(
                    new DataReader().readFile("./src/main/resources/datafile/data.txt")));



        new ArraySortService().shellSort(customArray);
        } catch (ApiException e) {
            System.out.println(e);
        }
        System.out.println(customArray.toString());

        ArrayStreamChangeService arrayStreamFindService=new ArrayStreamChangeService();
        try {
            arrayStreamFindService.changeElements    (customArray,">",0,0);
            System.out.println(customArray.toString());
            System.out.println(new ArrayCalculateService().averageOfArray(customArray));
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (IncorrectConditionException e) {
            e.printStackTrace();
        }

        // FileValidate validate = new FileValidate();
       // System.out.println(validate.valid(new File("./src/main/resources/data.txt")));
 // String str ="1, 2";
   //     System.out.println( str.matches("(-?\\d+[,]?\\s?)*"));

    }

}
