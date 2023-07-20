package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GreatestCommonDivisor {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    private static int findGCD(int number1, int number2) {
        int result = 0;
            for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
            result = i;
            }

        }
        return result;
    }
    public static void GCD() {
            int result;
            String[][] data = new String[3][2];
            for (int i = 0; i < 3; i++) {
                int number1 = Utils.generateRandomNumber(100);
                int number2 = Utils.generateRandomNumber(100);
                String question = number1 + " " + number2;
                data[i][0] = question;
                result = GreatestCommonDivisor.findGCD(number1, number2);
                data[i][1] = Integer.toString(result);
            }
            Engine.start(data, TASK);
        }
    }