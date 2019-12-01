import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StreamSecondBiggestTest {

    private StreamSecondBiggest sb = new StreamSecondBiggest();

    @Test
    public void secondBiggest() {
        int[] arr = {4,6,3,7,8,9,10,23,56,2,6,29};
        int expected = 29;
        int actual = sb.secondBiggest(arr);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondBiggest2() {
        int[] arr = {4,6,3,7,8,9,10,23,56,2,6,29,31,-1,6,28};
        int expected = 31;
        int actual = sb.secondBiggest(arr);

        Assert.assertEquals(expected,actual);
    }
}