package sortting;

import sortting.exceptions.ArraysSorterException;

public interface ArraySorter {
    int[] sortAscending(int[] arrayToSort) throws ArraysSorterException;
    int[] sortDescending(int[] arrayToSort) throws ArraysSorterException;
    default void validateArray(int[] arrayToSort) throws ArraysSorterException {
        if(arrayToSort == null){
            throw new ArraysSorterException("Arrays to sort cannot be null");
        }
    }
}
