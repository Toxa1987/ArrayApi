package by.anton.arrayapi.reader;

import by.anton.arrayapi.exception.ApiException;

import java.io.File;
import java.util.ArrayList;

public interface DataReaderInterface {
    public ArrayList<String> readFile(String path) throws ApiException;
}
