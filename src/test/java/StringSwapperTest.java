import org.junit.Test;
import software.ulpgc.StringSwapper;

import static org.junit.Assert.assertEquals;

public class StringSwapperTest {

    @Test
    public void swap_first_char_with_last_char() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "abcd";
        assertEquals("dbca", stringSwapper.swapFirstAndLastChar(test));
    }

    @Test
    public void swap_first_char_with_last_char_given_empty_string() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "";
        assertEquals("", stringSwapper.swapFirstAndLastChar(test));
    }

    @Test
    public void swap_first_char_with_last_char_given_one_char_string() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "a";
        assertEquals("a", stringSwapper.swapFirstAndLastChar(test));

    }
}
