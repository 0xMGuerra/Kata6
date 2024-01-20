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
}
