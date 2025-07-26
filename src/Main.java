import java.util.Scanner;
import java.util.function.BiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actionNumber = getActionNumber(scanner);

        System.out.println("Choose first number: ");
        int operationNumber1 = scanner.nextInt();
        System.out.println("Choose second number: ");
        int operationNumber2 = scanner.nextInt();

        performActionLogic(actionNumber, operationNumber1, operationNumber2, scanner);

    }

    private static void performActionLogic(int actionNumber, int operationNumber1,
                                           int operationNumber2, Scanner scanner) {
        switch (actionNumber) {
            case 1:
                performOperationLoop(CalculatorService.addition(operationNumber1, operationNumber2),
                        CalculatorService::addition, scanner);
                break;
            case 2:
                performOperationLoop(CalculatorService.subtraction(operationNumber1, operationNumber2),
                        CalculatorService::subtraction, scanner);
                break;
            case 3:
                performOperationLoop(CalculatorService.multiplication(operationNumber1, operationNumber2),
                        CalculatorService::multiplication, scanner);
                break;
            case 4:
//                performOperationLoop(CalculatorService.division(operationNumber1, operationNumber2),
//                        CalculatorService::division, scanner);
                break;
        }
    }

    private static int getActionNumber(Scanner scanner) {
        System.out.println("Hello and welcome in calculator!");
        System.out.println("1 addition \n" +
                "2 subtraction \n" +
                "3 multiplication \n" +
                "4 division \n" +
                "Choose number from 1 to 4: "
        );

        return scanner.nextInt();
    }

    private static void performOperationLoop(int initialResult, BiFunction<Integer, Integer, Integer> operation, Scanner scanner) {
        int result = initialResult;
        while (true) {
            System.out.println("Choose next number or insert \"=\" to get final result: ");
            String nextLine = scanner.next();
            if (nextLine.equals("=")) {
                System.out.println("Result: " + result);
                break;
            }
            try {
                int nextNumber = Integer.parseInt(nextLine);
                result = operation.apply(result, nextNumber);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }
    }
}