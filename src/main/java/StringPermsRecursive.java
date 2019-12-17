import java.util.ArrayList;
import java.util.List;

public class StringPermsRecursive {

    public static String[] findPerms (String word) {
        ArrayList<String> perms = new ArrayList<>();
        addPath("",word,perms);
        return perms.toArray(new String[0]);
    }

    public static void addPath(String prefix, String suffix, ArrayList<String> perms) {
        if (suffix.length() == 0) {
            perms.add(prefix);
        }

        for (int i=0; i<suffix.length(); i++) {
            addPath(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1,suffix.length()),perms);
        }
    }
}
