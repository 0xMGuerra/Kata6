package software.ulpgc;

public class StringSwapper {

    public String swapFirstAndLastChar(String s) {

        if(s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        int size = size(s);

        if(size <= 1) return s;

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(size - 1);
        String middleChars = s.substring(1, size - 1);

        return lastChar + middleChars + firstChar;
    }

    public int size(String s) {
        return s.length();
    }
}
