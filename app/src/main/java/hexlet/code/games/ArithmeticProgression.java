package hexlet.code.games;

import java.util.Arrays;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ArithmeticProgression {
    public static final int ROUNDS_NUMBER = 3;
    public static final int UPPER_BOUND = 10;
    public static final int UPPER_BOUND2 = 20;
    public static final int QUESTION_ANSWER = 2;
    public static final String TASK = "What number is missing in the progression?";

    public static void progression() {

        int[] massive = new int[UPPER_BOUND];
        int result;
        String[][] data = new String[ROUNDS_NUMBER][QUESTION_ANSWER];
        for (int i = 0; i < ROUNDS_NUMBER; i++) {

            int step = Utils.generateRandomNumber(UPPER_BOUND);
            int randomNumber = Utils.generateRandomNumber(UPPER_BOUND);
            massive[0] = Utils.generateRandomNumber(UPPER_BOUND2);
            for (int j = 1; j < massive.length; j++) {
                massive[j] = massive[0] + j * step;
            }
            String str = Arrays.toString(massive).replaceAll("\\[|]| ", "");
            var words = str.split(",");
            words[randomNumber] = "..";
            String newStr = String.join(",", words);
            String question = newStr.replace(',', ' ');
            data[i][0] = question;
            result = massive[randomNumber];
            data[i][1] = Integer.toString(result);
        }
        Engine.start(data, TASK);
    }
}

