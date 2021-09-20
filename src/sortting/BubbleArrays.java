package sortting;

import sortting.exceptions.ArraysSorterException;

public class BubbleArrays implements ArraySorter {

    @Override
    public int[] sortAscending(int[] arrayToSort) throws ArraysSorterException {
        validateArray(arrayToSort);

        int temp;
        for(int i = 0;i<arrayToSort.length-1;i++){
           for (int j = i+1; j<arrayToSort.length;j++){
               if(arrayToSort[i]>arrayToSort[j]){
                   temp = arrayToSort[i];
                   arrayToSort[i] = arrayToSort[j];
                   arrayToSort[j] = temp;
               }
           }
        }
        return arrayToSort;
    }

    @Override
    public int[] sortDescending(int[] arrayToSort) throws ArraysSorterException {
        validateArray(arrayToSort);
        int temp = -1;
        for(int i = 0;i<arrayToSort.length-1;i++){
            for (int j = i+1; j<arrayToSort.length;j++){
                if(arrayToSort[i] < arrayToSort[j]){
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
