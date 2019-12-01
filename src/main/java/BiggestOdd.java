import java.util.Arrays;

public class BiggestOdd {

    public int biggestOdd(int[] arr) {
        return Arrays.stream(arr).filter(x -> x%2 == 1).max().getAsInt();
    }
}
