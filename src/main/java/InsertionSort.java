import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) { //found an element in the wrong spot
                int valueToMove = array[i];
                int j = i-1;
                while (j>=0 && array[j] > valueToMove) {
                    array[j+1] = array[j];
                    j--;
                }
                // after those are moved, set the value to be moved here
                array[j+1] = valueToMove;
            }
        }
    }

    public static void insertionSortShorter(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int valueToMove = array[i];
            int j = i-1;
            while (j>=0 && array[j] > valueToMove) { // only moves if this element's out of order
                array[j+1] = array[j];
                j--;
            }
            // after those are moved, set the value to be moved here
            array[j+1] = valueToMove;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(String.join(",", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}
