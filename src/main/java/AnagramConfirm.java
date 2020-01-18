import java.util.Arrays;
import java.util.Stack;

public class AnagramConfirm {

    public static boolean confirm(String s1, String s2) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        int sum1 = Arrays.stream(s1.split("")).mapToInt(x -> primes[x.charAt(0)-97]).reduce(1, (a, b) -> a * b);
        int sum2 = Arrays.stream(s2.split("")).mapToInt(x -> primes[x.charAt(0)-97]).reduce(1, (a, b) -> a * b);

        return sum1 == sum2;
    }



}
