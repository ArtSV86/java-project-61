package hexlet.code.games;
import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class ArithmeticProgression {
    public static final String TASK = "What number is missing in the progression?";
    public static void progression() {

        int[] massive = new int[10];
        int result;
        String[][] data = new String[3][2];
        for (int i = 0; i < 3; i++) {

            int step = Utils.generateRandomNumber(10);
            int randomNumber = Utils.generateRandomNumber(10);
            massive[0] = Utils.generateRandomNumber(20);
            for (int j = 1; j < massive.length; j++) {
                massive[j] = massive[0] + j * step;
            }
            String str = Arrays.toString(massive).replaceAll("\\[|]| ", "");
            var words = str.split(",");
            words[randomNumber] = "..";
            String newStr = String.join(",", words);
            String question = newStr.replace (',', ' ');
        data[i][0] = question;
        result =  massive[randomNumber];
        data[i][1] = Integer.toString(result);
        }
        Engine.start(data, TASK);
    }
}

