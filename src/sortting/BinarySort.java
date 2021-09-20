package sortting;

import sortting.exceptions.ArraysSorterException;

import java.util.Arrays;

public class BinarySort implements ArraySorter{
    @Override
    public int[] sortAscending(int[] arrayToSort) throws ArraysSorterException {
        validateArray(arrayToSort);
        int midPoint = arrayToSort.length / 2;
        int temp;
        System.out.println(Arrays.toString(arrayToSort));
        for (int i =0; i<arrayToSort.length;i++){
            if(arrayToSort[i] > midPoint){
                arrayToSort[i] = midPoint;
            }
        }
        System.out.println(Arrays.toString(arrayToSort));
        return arrayToSort;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraysSorterException {
        return new int[0];
    }
}
