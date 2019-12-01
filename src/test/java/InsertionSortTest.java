import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {


    @Test
    public void insSort() {
        int[] array = new int[] {6,5,4,3,2,1};
        InsertionSort.insertionSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSort1() {
        int[] array = new int[] {2,4,3,5,1,6};
        InsertionSort.insertionSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSort2() {
        int[] array = new int[] {1,6,4,2,3,5};
        InsertionSort.insertionSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSort4() {
        int[] array = new int[] {2,3,4,5,1,6};
        InsertionSort.insertionSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSortShorter() {
        int[] array = new int[] {6,5,4,3,2,1};
        InsertionSort.insertionSortShorter(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSortShorter1() {
        int[] array = new int[] {2,4,3,5,1,6};
        InsertionSort.insertionSortShorter(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSortShorter2() {
        int[] array = new int[] {1,6,4,2,3,5};
        InsertionSort.insertionSortShorter(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void insSortShorter4() {
        int[] array = new int[] {2,3,4,5,1,6};
        InsertionSort.insertionSortShorter(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        InsertionSort.printArray(array);
        InsertionSort.printArray(expected);

        Assert.assertArrayEquals(expected, array);
    }
}