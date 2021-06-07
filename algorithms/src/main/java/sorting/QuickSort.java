package sorting;

public class QuickSort {

    public void sort(int[] inputArray, int begin, int end) {
        if(begin>=end) return;
        int pivot = partition(inputArray, begin, end);
        sort( inputArray, begin, pivot-1 );
        sort( inputArray, pivot+1, end );
    }

    private int partition(int[] inputArray, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if(inputArray[i] < inputArray[pivot]) {
                int temp = inputArray[counter];
                inputArray[counter] = inputArray[i];
                inputArray[i] = temp;
                counter++;
            }
        }
        int temp = inputArray[pivot];
        inputArray[pivot] = inputArray[counter];
        inputArray[counter] = temp;

        return counter;
    }

}
