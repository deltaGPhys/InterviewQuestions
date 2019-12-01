import java.util.Arrays;

public class StringUniqueCharsStream {

    public StringUniqueCharsStream() {
    }

    static boolean madeUnique(String string) {
        Long dupes = Arrays.stream(string.split("")).filter( x -> getOccurrences(string, x)!=1).count();
        if (dupes == 0) {
            return true;
        } else {
            return false;
        }
    }

    static Long getOccurrences(String string, String z) {
        return Arrays.stream(string.split("")).filter( x -> x.equals(z)).count();
    }
}
