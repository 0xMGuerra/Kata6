import org.junit.Test;
import software.ulpgc.StringSwapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
    public void swap_first_char_with_last_char_given_two_char_string() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "ab";
        assertEquals("ba", stringSwapper.swapFirstAndLastChar(test));
    }

    @Test
    public void check_size_given_string() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "abcd";
        assertEquals(4, stringSwapper.size(test));
    }

    @Test
    public void check_size_given_empty_string() {
        StringSwapper stringSwapper = new StringSwapper();
        String test = "";
        assertEquals(0, stringSwapper.size(test));
    }

    @Test
    public void check_when_given_null_argument() {
        StringSwapper stringSwapper = new StringSwapper();
        assertThrows(IllegalArgumentException.class, () -> stringSwapper.swapFirstAndLastChar(null));
    }
}
