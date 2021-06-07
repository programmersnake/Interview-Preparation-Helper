package searching;

public class BinarySearch {

    public int search(int searchValue, int[] inputArray) {
        int startIndex = 0;
        int finalIndex = inputArray.length - 1;

        while(startIndex <= finalIndex) {
            int middleIndex = (startIndex + finalIndex) / 2;

            if (inputArray[middleIndex] == searchValue) {
                return middleIndex;
            }
            else if (inputArray[middleIndex] < searchValue) {
                startIndex = middleIndex + 1;
            }
            else if (inputArray[middleIndex] > searchValue) {
                finalIndex = middleIndex - 1;
            }
        }
        return -1;
    }

}
