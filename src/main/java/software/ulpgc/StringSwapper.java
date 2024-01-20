package software.ulpgc;

public class StringSwapper {

    public String swapFirstAndLastChar(String s) {
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(3);
        String middleChars = s.substring(1,3);

        return lastChar + middleChars + firstChar;
    }
}
