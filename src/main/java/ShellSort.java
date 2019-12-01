import java.util.Arrays;

public class ShellSort {

    public ShellSort() {
    }

    public static void shellSort(int[] array) {
        int gap = array.length >> 1;
        while (gap >= 1) { // loop over gap sizes
            int elementIndex = 0;
            while (elementIndex < gap) { // create gap groups until hitting element #gap
                int i = elementIndex+gap;
                while (i < array.length) {
                    int valueToMove = array[i];
                    int j = i-gap;
                    while (j>=0 && array[j] > valueToMove) { // only moves if this element's out of order
                        array[j+gap] = array[j];
                        j-=gap;
                    }
                    // after those are moved, set the value to be moved here
                    array[j+gap] = valueToMove;
                    i += gap;
                }
                elementIndex++;
            }
            gap = gap >> 1;
        }
    }

    public static void printArray(int[] array) {
        System.out.println(String.join(",", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}
