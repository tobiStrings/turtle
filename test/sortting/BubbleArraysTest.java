package sortting;

import org.junit.jupiter.api.*;
import sortting.exceptions.ArraysSorterException;

import static org.junit.jupiter.api.Assertions.*;

class BubbleArraysTest {
    ArraySorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleArrays();
    }

    @AfterEach
    void tearDown() {
        sorter = null;
    }

    @Test
    void sortWithoutArray(){
        assertThrows(ArraysSorterException.class,()-> sorter.sortAscending(null));
    }

    @Test
    void sortArray(){
        int[] scores = {10,5,3,7,9,2,1,6,4,8};
        assertEquals(10,scores.length);
        int[] expectedScores = {1,2,3,4,5,6,7,8,9,10};
        try {
            int[] sortedScores = sorter.sortAscending(scores);
            assertArrayEquals(expectedScores,sortedScores);
        } catch (ArraysSorterException e) {
            e.printStackTrace();
        }
    }


    @Test
    void sortWithoutArrayDescending(){
        assertThrows(ArraysSorterException.class,()-> sorter.sortAscending(null));
    }

    @Test
    void sortArrayDescending(){
        int[] scores = {10,5,3,7,9,2,1,6,4,8};
        assertEquals(10,scores.length);
        int[] expectedScores = {10,9,8,7,6,5,4,3,2,1};
        try {
            int[] sortedScores = sorter.sortDescending(scores);
            assertArrayEquals(expectedScores,sortedScores);
        } catch (ArraysSorterException e) {
            e.printStackTrace();
        }
    }
}