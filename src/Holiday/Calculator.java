package Holiday;

import java.util.Scanner;

public class Calculator {

    private static final String ACTION_PLUS = "+";
    private static final String ACTION_MINUS = "-";
    private static final String ACTION_DIVIDE = "/";
    private static final String ACTION_MULTIPLY = "*";
    private static final String MESSAGE_ENTER_FIRST_NUMBER = "Enter first number: ";
    private static final String MESSAGE_ENTER_SECOND_NUMBER = "Enter second number: ";
    private static final String MESSAGE_ENTER_ACTION = "Enter action [+ - / *]: ";
    private static final String MESSAGE_RESULT = "Result: ";
    private static final String MESSAGE_ERROR = "You entered something wrong! :( ";


    public static void calculate(Scanner input) {
        while (true) {
            int res;
            int num1 = getNumber(input, MESSAGE_ENTER_FIRST_NUMBER);
            int num2 = getNumber(input, MESSAGE_ENTER_SECOND_NUMBER);
            String action;
            action = getAction(input, MESSAGE_ENTER_ACTION);
            switch (action) {
                case ACTION_PLUS:
                    res = num1 + num2;
                    printResult(MESSAGE_RESULT, res);
                    return;
                case ACTION_MINUS:
                    res = num1 - num2;
                    printResult(MESSAGE_RESULT, res);
                    return;
                case ACTION_MULTIPLY:
                    res = num1 * num2;
                    printResult(MESSAGE_RESULT, res);
                    return;
                case ACTION_DIVIDE:
                    res = num1 / num2;
                    printResult(MESSAGE_RESULT, res);
                    return;
                default:
                    printResult("\n" + MESSAGE_ERROR);
                    return;
            }
        }
    }

    private static int getNumber(Scanner input, String message) {
        printMessage(message);
        try {
            return Integer.parseInt(input.next());
        } catch (NumberFormatException e) {
            printMessage(MESSAGE_ERROR);
            return getNumber(input, message);
        }
    }

    private static String getAction(Scanner input, String message) {
        printMessage(message);
        String action = input.next();
        if (action.equals(ACTION_PLUS) || action.equals(ACTION_MINUS) || action.equals(ACTION_MULTIPLY) ||
            action.equals(ACTION_DIVIDE)) {
            return action;
        } else {
            printMessage(MESSAGE_ERROR);
            return getAction(input, message);
        }
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printResult(String message, int res) {
        System.out.println(message + res);
    }

    private static void printResult(String message) {
        System.out.println(message);
    }
}


