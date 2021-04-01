package by.anton.arrayapi.reader.impl;

import by.anton.arrayapi.exception.ApiException;
import by.anton.arrayapi.reader.DataReaderInterface;
import by.anton.arrayapi.validate.impl.FileValidate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader implements DataReaderInterface {
    private static final Logger logger = LogManager.getLogger();

    public ArrayList<String> readFile(String path) throws ApiException {
        logger.info("Method readFile called");
        File file = new File(path);
        FileValidate fileValidate = new FileValidate();
        if (!fileValidate.valid(file)) {
            throw new ApiException("File is not exist or is empty");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)) {
            logger.info("Connection with file successful");
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
