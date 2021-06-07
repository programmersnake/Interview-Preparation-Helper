package searching;

public class BinarySearch {

    public int search(int value, int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while(startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if(array[middleIndex] == value) {
                return value;
            }
            else if(array[middleIndex]>value) {
                endIndex = middleIndex;
            }
            else {
                startIndex = middleIndex;
            }
        }
        return -1;
    }

}
