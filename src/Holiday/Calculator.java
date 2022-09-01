package Holiday;

import java.util.Scanner;

public class Calculator {
    public static Integer calculate(Scanner input) {
        while (true) {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();

            int res;

            System.out.println("Enter two number: ");
            int num2 = input.nextInt();

            System.out.println("Enter action [+ - / *]: ");
            String action = input.nextLine();
            action = input.nextLine();

            switch (action) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Result: " + res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("Result: " + res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("Result: " + res);
                    break;
                case "/":
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                    break;
                default:
                    System.out.println("\n" +
                            "You entered something wrong! :(");
                    break;
            }
        }
    }
}

