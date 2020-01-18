import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramConfirmTest {

    @Test
    public void confirm() {
        Assert.assertFalse(AnagramConfirm.confirm("abc","cow"));
    }

    @Test
    public void confirm1() {
        Assert.assertTrue(AnagramConfirm.confirm("abc","cba"));
    }

    @Test
    public void confirm2() {
        Assert.assertTrue(AnagramConfirm.confirm("toomanysecrets","setecastronomy"));
    }

    @Test
    public void confirm3() {
        Assert.assertTrue(AnagramConfirm.confirm("satan","santa"));
    }

    @Test
    public void confirm4() {
        Assert.assertTrue(AnagramConfirm.confirm("cat","atc"));
    }

    @Test
    public void confirm5() {
        Assert.assertFalse(AnagramConfirm.confirm("rough","tough"));
    }
}