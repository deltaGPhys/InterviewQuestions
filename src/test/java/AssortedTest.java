import org.junit.Assert;
import org.junit.Test;


public class AssortedTest {

    @Test
    public void firstPosIntTest() {

        Assert.assertEquals(6,new Assorted().firstPosInt(new int[]{1,3,2,1,2,1,5,3,3,4,2}));
        Assert.assertEquals(2,new Assorted().firstPosInt(new int[]{-1,-3,1,5,3,4,6,8}));
        Assert.assertEquals(4,new Assorted().firstPosInt(new int[]{0,6,3,2,5,1,7,8}));
    }

    @Test
    public void countWordsTest() {
        Assert.assertEquals(5,Assorted.countWords("Hello, there. How are you doing today? I'm great, thanks!"));
    }

    @Test
    public void countStrokes() {
        Assert.assertEquals(9,Assorted.countStrokes(new int[] {1,3,2,1,2,1,5,3,3,4,2}));
    }
}