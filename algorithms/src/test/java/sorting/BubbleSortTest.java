package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        List<Integer> exceptedList = Arrays.asList( -1, 2, 3, 5, 6, 8, 9, 10 );

        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort( new int[]{2, 3, 5, 6, 8, 10, 9, -1}, false );

        for (int i = 0, actualListSize = exceptedList.size(); i < actualListSize; i++) {
            Integer actualInteger = sortedArray[i];
            Integer exceptedInteger = exceptedList.get( i );
            Assertions.assertEquals( actualInteger, exceptedInteger );
        }
    }

    @Test
    void reverseSort() {
        List<Integer> exceptedList = Arrays.asList( 10, 9, 8, 6, 5, 3, 2, -1 );

        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort( new int[]{2, 3, 5, 6, 8, 10, 9, -1}, true );

        for (int i = 0, actualListSize = exceptedList.size(); i < actualListSize; i++) {
            Integer actualInteger = sortedArray[i];
            Integer exceptedInteger = exceptedList.get( i );
            Assertions.assertEquals( actualInteger, exceptedInteger );
        }
    }

}