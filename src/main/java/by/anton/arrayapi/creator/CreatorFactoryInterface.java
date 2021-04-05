package by.anton.arrayapi.creator;

import by.anton.arrayapi.entity.CustomArray;
import by.anton.arrayapi.exception.ApiException;

public interface CreatorFactoryInterface {
    public CustomArray createCustomArray(int[] someArray) throws ApiException;
}
