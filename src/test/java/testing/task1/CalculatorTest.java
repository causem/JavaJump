package testing.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAdd() {
        //given

        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        // when
        int result = calculator.add(a, b);

        //then
        assertEquals(5, result);
    }
}