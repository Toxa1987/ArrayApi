package by.anton.arrayapi.parser.impl;

import by.anton.arrayapi.parser.StringParserInterface;
import by.anton.arrayapi.validate.impl.StringValidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class StringParser implements StringParserInterface {
    private static final Logger logger = LogManager.getLogger();

    public int[] parseString(ArrayList<String> arrayList) {
        logger.info("Method parseString called");
        int[] arrayInt = null;
        for (String string : arrayList) {
            if (new StringValidate().isValid(string)) {
                String[] elements = string.split(", ");
                arrayInt = new int[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    arrayInt[i] = Integer.parseInt(elements[i]);
                }
                break;
            }
        }
        return arrayInt;
    }
}
