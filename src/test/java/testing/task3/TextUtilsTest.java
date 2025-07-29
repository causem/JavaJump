package testing.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TextUtilsTest {
    private TextUtils textUtils;

    @BeforeEach
    void setUp() {
        textUtils = new TextUtils();
    }

    @Test
    void reversedNormalText() {
        //given
        String input = "Java";

        //when
        String result = textUtils.reverseString(input);

        //then
        assertEquals("avaJ", result);
    }

    @Test
    void reversedEmptyString() {
        //given
        String input = "";

        //when
        String result = textUtils.reverseString(input);

        //then
        assertEquals("", result);
    }

    @Test
    void reverseNull() {
        //given
        String input = null;

        //when
        String result = textUtils.reverseString(input);

        //then
        assertNull(result);
    }


}