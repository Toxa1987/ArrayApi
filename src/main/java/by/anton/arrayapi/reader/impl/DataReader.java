package by.anton.arrayapi.reader.impl;

import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.reader.DataReaderInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader implements DataReaderInterface {
    private static final Logger logger = LogManager.getLogger();

    public ArrayList<String> readFile(File file) throws ApiException {
        logger.info("Method readFile called");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            logger.info("Connection successful");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new ApiException("File not found", e);
        }
        return arrayList;
    }
}
