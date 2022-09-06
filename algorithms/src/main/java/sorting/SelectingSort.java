package sorting;

public class SelectingSort {

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) { // if '<' will be decreasing order
                    minIndex = j;
                }
            }
            int tempValue = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tempValue;
        }
        return array;
    }

}
