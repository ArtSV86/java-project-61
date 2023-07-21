package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 100;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "Find the greatest common divisor of given numbers.";

    private static int findGcd(int number1, int number2) {
        int result = 1;
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                result = i;
            }

        }
        return result;
    }

    public static void runGcd() {
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number1 = Utils.generateRandomNumber(UPPER_BOUND);
            int number2 = Utils.generateRandomNumber(UPPER_BOUND);
            String question = number1 + " " + number2;
            data[i][0] = question;
            int result = GreatestCommonDivisor.findGcd(number1, number2);
            data[i][1] = Integer.toString(result);
        }
        Engine.start(data, TASK);
    }
}
