package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        List<Integer> exceptedList = Arrays.asList( -1, 2, 3, 5, 6, 8, 9, 10 );

        int[] array = new int[]{2, 3, 5, 6, 8, 10, 9, -1};

        QuickSort quickSort = new QuickSort();
        quickSort.sort( array, 0, array.length-1 );

        for (int i = 0, actualListSize = exceptedList.size(); i < actualListSize; i++) {
            Integer actualInteger = array[i];
            Integer exceptedInteger = exceptedList.get( i );
            Assertions.assertEquals( actualInteger, exceptedInteger );
        }
    }
}