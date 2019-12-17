import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void test1() {
        int[] arr = new int[] {1};
        int toFind = 0;
        int expected = -1;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() {
        int[] arr = new int[] {1};
        int toFind = 1;
        int expected = 0;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3() {
        int[] arr = new int[] {1,2,5,7,9,11,35,67,90,112,345,544,566,677};
        int toFind = 100;
        int expected = -1;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test4() {
        int[] arr = new int[] {1,2,5,7,9,11,35,67,90,112,345,544,566,677};
        int toFind = 544;
        int expected = 11;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test5() {
        int[] arr = new int[] {-123,-100,-98,-45,-23,-4,1,3,4,7,12,23,24,26,27,46,75,87,123,462,564,567,667,1000,1352,1543,1748};
        int toFind = -45;
        int expected = 3;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test6() {
        int[] arr = new int[] {-123,-100,-98,-45,-23,-4,1,3,4,7,12,23,24,26,27,46,75,87,123,462,564,567,667,1000,1352,1543,1748};
        int toFind = -123;
        int expected = 0;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test7() {
        int[] arr = new int[] {-123,-100,-98,-45,-23,-4,1,3,4,7,12,23,24,26,27,46,75,87,123,462,564,567,667,1000,1352,1543,1748};
        int toFind = 1748;
        int expected = arr.length-1;
        int actual = BinarySearch.search(arr,toFind);
        Assert.assertEquals(expected,actual);
    }
}