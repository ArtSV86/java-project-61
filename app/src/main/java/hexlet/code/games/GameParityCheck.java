package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GameParityCheck {
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
        String[][] data = new String[3][2];

        for(int i = 0; i < 3; i++) {
        int number = Utils.generateRandomNumber(1000);

        String question = Integer.toString(number);
        data[i][0] = question;
        result = ParityCheck(number);
        data[i][1] = result;
        }
        Engine.start(data, TASK);
        }
    }