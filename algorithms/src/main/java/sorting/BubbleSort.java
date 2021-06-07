package sorting;

public class BubbleSort {

    public int[] sort(int[] inputArray, boolean isReverse) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < inputArray.length-1; i++) {
                if(isReverse) {
                    if (inputArray[i] < inputArray[i+1]) {
                        int tempValue = inputArray[i];
                        inputArray[i] = inputArray[i+1];
                        inputArray[i+1] = tempValue;
                        isSorted = false;
                    }
                }
                else {
                    if (inputArray[i] > inputArray[i+1]) {
                        int tempValue = inputArray[i];
                        inputArray[i] = inputArray[i+1];
                        inputArray[i+1] = tempValue;
                        isSorted = false;
                    }
                }
            }
        }
        return inputArray;
    }

}
