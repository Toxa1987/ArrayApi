package by.anton.arrayapi.validate.impl;

import by.anton.arrayapi.validate.FileValidateInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileValidate implements FileValidateInterface {
    private static final Logger logger = LogManager.getLogger();

    public boolean valid(File file) {
        logger.info("Method of validation file called with next options: "+file.getPath());
        boolean flag = false;
        if (file.exists()) {
            if (file.length() > 0) {
                flag = true;
            }
        }
        return flag;
    }
}
