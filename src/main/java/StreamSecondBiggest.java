import com.sun.tools.jdi.IntegerValueImpl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class StreamSecondBiggest {

    public StreamSecondBiggest() {

    }

    public int secondBiggest(int[] arr) {
        return Arrays.stream(arr).filter(x -> x != findMax(arr)).max().getAsInt();
    }

    public int findMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
