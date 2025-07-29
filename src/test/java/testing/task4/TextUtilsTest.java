package testing.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextUtilsTest {

    private TextUtils textUtils;

    @BeforeEach
    void setup() {
        textUtils = new TextUtils();
    }

    @Test
    void isEmptyShouldReturnTrueForNull() {
        // given
        String input = null;

        // when
        boolean result = textUtils.isEmpty(input);

        // then
        assertTrue(result);
    }

    @Test
    void isEmptyShouldReturnTrueForEmpty() {
        // given
        String input = "";

        // when
        boolean result = textUtils.isEmpty(input);

        // then
        assertTrue(result);
    }

    @Test
    void isEmptyShouldReturnFalseForNonEmpty() {
        // given
        String input = "Java";

        // when
        boolean result = textUtils.isEmpty(input);

        // then
        assertFalse(result);
    }

}