package testing.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120"
    })
    void testFactorial(int input, int expected) {

        // when
        int result = mathUtils.factorial(input);

        // then
        assertEquals(expected, result);
    }

    @Test
    void factorialOfNegativeShouldThrowException() {
        // given
        int number = -3;

        // then
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(number));
    }
}



