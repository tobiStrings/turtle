package sortting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sortting.exceptions.ArraysSorterException;

import static org.junit.jupiter.api.Assertions.*;

class BinarySortTest {
    ArraySorter sorter;
    @BeforeEach
    void setUp() {
        sorter = new BinarySort();
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
    void sortAscending() {
        int[] scores = {10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        assertEquals(10, scores.length);
        int[] expectedScores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int[] sortedScores = sorter.sortAscending(scores);
            assertArrayEquals(expectedScores, sortedScores);
        } catch (ArraysSorterException e) {
            e.printStackTrace();
        }
    }
}