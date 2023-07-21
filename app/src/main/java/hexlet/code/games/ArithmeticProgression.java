package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ArithmeticProgression {
    public static final int ROUNDS_NUMBER = 3;
    public static final int LIMIT = 10;
    public static final int UPPER_BOUND = 10;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "What number is missing in the progression?";

    public static void runProgression() {


        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            String[] progression = new String[LIMIT];
            int step = Utils.generateRandomNumber(UPPER_BOUND);
            int hiddenMemberIndex = Utils.generateRandomNumber(UPPER_BOUND);
            int progressionZero = Utils.generateRandomNumber(UPPER_BOUND);
            progression[0] = Integer.toString(progressionZero);
            for (int j = 1; j < progression.length; j++) {
                progression[j] = Integer.toString(progressionZero + j * step);
            }

            var result = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            var question = String.join(" ", progression);
            data[i][0] = question;
            data[i][1] = result;
        }
        Engine.start(data, TASK);
    }
}
