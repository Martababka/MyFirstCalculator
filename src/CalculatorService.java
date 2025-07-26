public class CalculatorService {

    public static int addition(int operationNumber1, int operationNumber2) {
        return operationNumber1 + operationNumber2;
    }

    public static int subtraction(int operationNumber1, int operationNumber2) {
        return operationNumber1 - operationNumber2;
    }

    public static int multiplication(int operationNumber1, int operationNumber2) {
        return operationNumber1 * operationNumber2;
    }

    public static double division(int operationNumber1, int operationNumber2) {
        return (operationNumber1 * 1.0) / operationNumber2;
    }
}
