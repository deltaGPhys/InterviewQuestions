import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramFindTest {

    @Test
    public void finder() {
        String[] anagrams = AnagramFind.finder("somy");

        for (String s: anagrams) {
            System.out.println(s);
        }
    }
}