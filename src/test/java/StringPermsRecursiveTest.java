import org.junit.Assert;
import org.junit.Test;

public class StringPermsRecursiveTest {

    @Test
    public void findPerms() {
        String word = "a";
        String[] expected = new String[] {"a"};
        String[] actual = StringPermsRecursive.findPerms(word);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findPerms2() {
        String word = "abc";
        String[] expected = new String[] {"abc","acb","bac","bca","cab","cba"};
        String[] actual = StringPermsRecursive.findPerms(word);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findPerms3() {
        String word = "at";
        String[] expected = new String[] {"at","ta"};
        String[] actual = StringPermsRecursive.findPerms(word);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findPerms4() {
        String word = "abcd";
        String[] expected = new String[] {"abcd","abdc","acbd","acdb","adbc","adcb","bacd","badc","bcad","bcda","bdac","bdca","cabd","cadb","cbad","cbda","cdab","cdba","dabc","dacb","dbac","dbca","dcab","dcba"};
        String[] actual = StringPermsRecursive.findPerms(word);
        Assert.assertArrayEquals(expected, actual);
    }
}