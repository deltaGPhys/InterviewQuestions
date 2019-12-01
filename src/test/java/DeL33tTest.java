import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeL33tTest {

    @Test
    public void translate() {
        String input = "1337";
        String expected = "leet";
        String actual = DeL33t.translate(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void translate2() {
        String input = "Z!pC0de";
        String expected = "ZipCode";
        String actual = DeL33t.translate(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void translate3() {
        String input = "a3!0u";
        String expected = "aeiou";
        String actual = DeL33t.translate(input);
        System.out.println((int) '!');
        Assert.assertEquals(expected,actual);

    }
}