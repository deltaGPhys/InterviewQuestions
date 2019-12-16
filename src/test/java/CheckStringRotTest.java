import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringRotTest {

    @Test
    public void isRot() {
        String str1 = "string";
        String str2 = "ingstr";
        boolean expected = true;
        boolean actual = CheckStringRot.isRot(str1,str2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isRot2() {
        String str1 = "string";
        String str2 = "ngstri";
        boolean expected = true;
        boolean actual = CheckStringRot.isRot(str1,str2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isRot3() {
        String str1 = "string";
        String str2 = "sngtir";
        boolean expected = false;
        boolean actual = CheckStringRot.isRot(str1,str2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isRot4() {
        String str1 = "zipcode";
        String str2 = "odezipc";
        boolean expected = true;
        boolean actual = CheckStringRot.isRot(str1,str2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isRot5() {
        String str1 = "employed";
        String str2 = "loedymep";
        boolean expected = false;
        boolean actual = CheckStringRot.isRot(str1,str2);
        Assert.assertEquals(expected, actual);
    }
}