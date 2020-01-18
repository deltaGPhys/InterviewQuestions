import java.util.HashSet;
import java.util.Set;

public class AnagramFind {

    public static String[] finder(String word) {
        HashSet<String> words = new HashSet<String>();
        anagram(word,"",words);

        return words.toArray(new String[0]);
    }

    public static void anagram(String word, String prefix, Set<String> words) {

        if (word.length() == 1) {
            words.add(word+prefix);
        } else {
            for (int i = 0; i < word.length(); i++) {
                AnagramFind.anagram( word.substring(0, i) + word.substring(i + 1), prefix + word.charAt(i), words);
            }
        }
    }
}
