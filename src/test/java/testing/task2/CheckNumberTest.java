package testing.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckNumberTest {

    private CheckNumber checkNumber;

    @BeforeEach
    void setUp() {
        checkNumber = new CheckNumber();
    }

    @Test
    void isEvenTrue() {
        // given
        int number = 4;

        // when
        boolean result = checkNumber.isEven(number);

        // then
        assertTrue(result);
    }

    @Test
    void isEvenFalse() {
        // given
        int number = 3;

        // when
        boolean result = checkNumber.isEven(number);

        // then
        assertFalse(result);
    }
}