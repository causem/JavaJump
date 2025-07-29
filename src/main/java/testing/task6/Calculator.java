package testing.task6;

public class Calculator {
    private final LoggerService loggerService;

    public Calculator(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public int add(int a, int b) {
        int result = a + b;
        loggerService.log("Result of addition: " + result);
        return result;
    }
}

