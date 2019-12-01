import org.junit.Assert;
import org.junit.Test;

public class BiggestOddTest {

    private BiggestOdd bo = new BiggestOdd();

    @Test
    public void biggestOdd1() {
        int[] arr = {4,6,3,7,8,9,10,23,57,2,6,29};
        int expected = 57;
        int actual = bo.biggestOdd(arr);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void biggestOdd2() {
        int[] arr = {4,6,3,7,8,9,10,23,56,2,6,29,31,-1,6,28};
        int expected = 31;
        int actual = bo.biggestOdd(arr);

        Assert.assertEquals(expected,actual);
    }
}
