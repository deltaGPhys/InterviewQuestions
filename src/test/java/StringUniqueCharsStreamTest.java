import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUniqueCharsStreamTest {

    StringUniqueCharsStream su = new StringUniqueCharsStream();

    @Test
    public void test1() {
        String string = "asdfghjk";
        Assert.assertTrue(StringUniqueCharsStream.madeUnique(string));
    }

    @Test
    public void test2() {
        String string = "fasdfghjk";
        Assert.assertFalse(StringUniqueCharsStream.madeUnique(string));
    }
}