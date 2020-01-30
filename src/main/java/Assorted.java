

import java.util.*;
import java.util.stream.Collectors;

public class Assorted {

    // find the first positive integer not present in given array
    public int firstPosInt(int[] A) {
        List<Integer> sortedList = Arrays.stream(A).boxed().filter(x -> x > 0).sorted().collect(Collectors.toList());

        if (sortedList.size() == 0) {
            return 1;
        }
        for (int i = 1; i < sortedList.size()+2; i++) {
            if (!sortedList.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // return longest sentence in input (sentences sep. by ., !, ?)
    public static int countWords(String S) {
        String delim = "[\\.!?]";
        String[] sentences = S.split(delim);
        int maxNum = 0;

        for (String sent: sentences) {
            String[] words = sent.trim().split("\\s+");
            if (words.length > maxNum) {
                maxNum = words.length;
            }
        }
        return maxNum;
    }

    // Determine how many horizontal strokes are required to paint a skyline, encoded as an int array of heights.
    // This method is straightforward, but it's better to do it with a single pass - decreasing in height by n
    // from one column to the next ends n strokes.
    public static int countStrokes(int[] A) {
        int numStrokes = 0;

        int maxH = maxHeight(A);
        int currLevel = maxH;
        for (int i = maxH; i > 0; i--) {
            numStrokes += findStrokes(A, currLevel);
            currLevel--;
        }

        return numStrokes;
    }

    public static int findStrokes(int[] A, int level) {
        int strokes = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= level) { //found the beginning of a group
                int j = 0;
                while (i+j < A.length && A[i+j] >= level) {
                    j++;
                }
                i += j;
                strokes++;
            }
        }
        return strokes;
    }

    public static int maxHeight(int[] A) {
        int maxH = 0;
        for (int num: A) {
            if (num > maxH) {
                maxH = num;
            }
        }
        return maxH;
    }
}
