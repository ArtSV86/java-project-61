package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 100;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String checkPrimeNumber(int number) {
        int count = 0;
        String result = null;
        if (number > 1 && number <= 3) {
            result = "yes";
            return result;
        } else if (number >= 0 && number <= 1) {
            result = "no";
            return result;
        } else if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count >= 1) {
                result = "no";
                return result;
            } else {
                result = "yes";
                return result;
            }
        }
        return result;
    }

    public static void prime() {


        String result;
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number = Utils.generateRandomNumber(UPPER_BOUND);

            String question = Integer.toString(number);
            data[i][0] = question;
            result = checkPrimeNumber(number);
            data[i][1] = result;
        }
        Engine.start(data, TASK);
    }
}
