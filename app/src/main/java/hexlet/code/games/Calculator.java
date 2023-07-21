package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 100;
    public static final int QUESTION_ANSWER = 2;
    public static final int NUMBER_OF_OPERATORS = 3;
    public static final String TASK = "What is the result of the expression?";

    private static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        int i = Utils.generateRandomNumber(NUMBER_OF_OPERATORS);
        return operators[i];
    }

    public static int calculate(int number1, int number2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                return result;
            case "-":
                result = number1 - number2;
                return result;
            case "*":
                result = number1 * number2;
                return result;
        }
        return result;

    }

    public static void runCalc() {
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number1 = Utils.generateRandomNumber(UPPER_BOUND);
            int number2 = Utils.generateRandomNumber(UPPER_BOUND);
            String operator = generateOperator();
            String question = number1 + " " + operator + " " + number2;
            data[i][0] = question;
            int result = calculate(number1, number2, operator);
            data[i][1] = Integer.toString(result);
        }
        Engine.start(data, TASK);
    }
}
