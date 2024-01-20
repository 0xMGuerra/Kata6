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

        StringBuilder result = new StringBuilder(size);
        result.append(lastChar).append(middleChars).append(firstChar);

        return result.toString();
    }

    public int size(String s) {
        return s.length();
    }

    public String swapWholeString(String s) {

        if(s == null) {
            throw new IllegalArgumentException("String cannot be null.");
        }
        int size = size(s);

        StringBuilder reversed = new StringBuilder(size);

        for (int i = size - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
}
