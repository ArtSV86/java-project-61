package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameParityCheck {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 1000;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void runEven() {
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number = Utils.generateRandomNumber(UPPER_BOUND);

            String question = Integer.toString(number);
            data[i][0] = question;
            String result = isEven(number) ? "yes" : "no";
            data[i][1] = result;
        }
        Engine.start(data, TASK);
    }
}
