import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class dupeFinderTest {

    @Test
    public void addToArray() {
        int[] arr = new int[] {};
        int index = 0;
        int toAdd = 1;
        int[] expected = new int[] {1};
        int[] actual = dupeFinder.addToArray(arr,index,toAdd);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addToArray2() {
        int[] arr = new int[] {1,2,3};
        int index = 0;
        int toAdd = 4;
        int[] expected = new int[] {4,1,2,3};
        int[] actual = dupeFinder.addToArray(arr,index,toAdd);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addToArray3() {
        int[] arr = new int[] {2,3,4,5,6};
        int index = 3;
        int toAdd = 1;
        int[] expected = new int[] {2,3,4,1,5,6};
        int[] actual = dupeFinder.addToArray(arr,index,toAdd);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addToArray4() {
        int[] arr = new int[] {4,5,6,7,8,9};
        int index = 6;
        int toAdd = 1;
        int[] expected = new int[] {4,5,6,7,8,9,1};
        int[] actual = dupeFinder.addToArray(arr,index,toAdd);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findDupes() {
        int[] arr = new int[] {4,5,6,7,8,9};
        int[] expected = new int[] {};
        int[] actual = dupeFinder.findDupes(arr);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findDupes2() {
        int[] arr = new int[] {4,5,6,7,8,9,5,2,4};
        int[] expected = new int[] {4,5};
        int[] actual = dupeFinder.findDupes(arr);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findDupes3() {
        int[] arr = new int[] {3,3,5,6,7,8,9,5};
        int[] expected = new int[] {3,5};
        int[] actual = dupeFinder.findDupes(arr);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findDupes4() {
        int[] arr = new int[] {1,2,3,4,5,6,5,4,3,2,1};
        int[] expected = new int[] {1,2,3,4,5};
        int[] actual = dupeFinder.findDupes(arr);
        Assert.assertArrayEquals(expected, actual);
    }
}