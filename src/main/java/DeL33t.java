public class DeL33t {
    enum L33tSub {
        _48('o'), //0
        _51('e'), //3
        _33('i'), //!
        _49('l'), //1
        _55('t'), //7
        ;

        private char realChar;

        L33tSub(char value) {
            this.realChar = value;
        }

        public static Character replace(char inChar) {
            for (L33tSub num : L33tSub.values()) {
                if (num.toString().equals("_"+(int)inChar)){
                    return num.realChar;
                }
            }
            return null;
        }
    }

    public static String translate (String word) {
        StringBuilder translated = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            Character sub = L33tSub.replace(word.charAt(i));
            if (sub != null) {
                translated.setCharAt(i,sub);
            }
        }
        return translated.toString();

    }
}
