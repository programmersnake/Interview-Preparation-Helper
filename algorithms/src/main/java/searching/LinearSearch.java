package searching;

import java.util.Arrays;

public class LinearSearch {

    public int search (int searchValue, int[] inputArray) {
        for (int i = 0, inputArrayLength = inputArray.length; i < inputArrayLength; i++) {
            int value = inputArray[i];
            if ( searchValue == value )
                return i;
        }
        return -1;
    }

}
