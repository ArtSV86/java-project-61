package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 100;
    public static final int QUESTION_ANSWER = 2;

    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runPrime() {

        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number = Utils.generateRandomNumber(UPPER_BOUND);

            String question = Integer.toString(number);
            data[i][0] = question;
            String result = isSimple(number) ? "yes" : "no";
            data[i][1] = result;
        }
        Engine.start(data, TASK);
    }
}
