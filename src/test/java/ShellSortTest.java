import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void shellSort() {
        int[] array = new int[] {6,5,4,3,2,1};
        ShellSort.shellSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        ShellSort.printArray(array);
        ShellSort.printArray(expected);

        //Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void shellSort2() {
        int[] array = new int[] {6,2,3,4,1,5};
        ShellSort.shellSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        ShellSort.printArray(array);
        ShellSort.printArray(expected);

        //Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void shellSort3() {
        int[] array = new int[] {1,2,6,3,4,5};
        ShellSort.shellSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        ShellSort.printArray(array);
        ShellSort.printArray(expected);

        //Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void shellSort4() {
        int[] array = new int[] {2,6,3,5,1,4};
        ShellSort.shellSort(array);
        int[] expected = new int[] {1,2,3,4,5,6};

        ShellSort.printArray(array);
        ShellSort.printArray(expected);

        //Assert.assertArrayEquals(expected, array);
    }


}