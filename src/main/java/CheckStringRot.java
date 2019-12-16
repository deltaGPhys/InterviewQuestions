public class CheckStringRot {

    public static boolean isRot(String string1, String string2) {
        return (string2+string2).contains(string1);
    }
}
