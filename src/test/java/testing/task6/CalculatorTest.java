package testing.task6;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CalculatorTest {
    @Test
    void shouldLogResultOfAddition() {
        // given
        LoggerService mockLogger = mock(LoggerService.class);
        Calculator calculator = new Calculator(mockLogger);

        // when
        int result = calculator.add(3, 4);

        // then
        verify(mockLogger).log("Result of addition: 7");
    }
}