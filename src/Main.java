import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome in calculator!");
        System.out.println("1 addition \n" +
                "2 subtraction \n" +
                "3 multiplication \n" +
                "4 division \n" +
                "Choose number from 1 to 4: "
        );

        int actionNumber = scanner.nextInt();

        System.out.println("Choose first number: ");
        int operationNumber1 = scanner.nextInt();
        System.out.println("Choose second number: ");
        int operationNumber2 = scanner.nextInt();

        switch (actionNumber) {
            case 1:
                System.out.println(CalculatorService.addition(operationNumber1, operationNumber2));
                break;
            case 2:
                System.out.println(CalculatorService.subtraction(operationNumber1, operationNumber2));
                break;
            case 3:
                System.out.println(CalculatorService.multiplication(operationNumber1, operationNumber2));
                break;
            case 4:
                System.out.println(CalculatorService.division(operationNumber1, operationNumber2));
                break;
        }

    }
}