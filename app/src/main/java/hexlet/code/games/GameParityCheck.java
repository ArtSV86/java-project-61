package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameParityCheck {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 1000;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String ParityCheck(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void gameEven() {
        String result;
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            int number = Utils.generateRandomNumber(UPPER_BOUND);

            String question = Integer.toString(number);
            data[i][0] = question;
            result = ParityCheck(number);
            data[i][1] = result;
        }
        Engine.start(data, TASK);
    }
}