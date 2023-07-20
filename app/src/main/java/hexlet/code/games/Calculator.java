package hexlet.code.games;
import java.util.Random;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Calculator {
    public static final String TASK = "What is the result of the expression?";

    private static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(3);
        return operators[i];
    }
    public static int calculate(int number1, int number2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            default:
                System.out.println("There's no such operation");
        }

        return result;
    }
    public static void gameCalc() {
        int result;
        String[][] data = new String[2][1];
           for (int i = 0; i < 3; i++) {
                int number1 = Utils.generateRandomNumber(100);
                int number2 = Utils.generateRandomNumber(100);
                String operator = generateOperator();
                String question = number1 + " " + operator + " " + number2;
                data[i][0] = question;
                result = calculate(number1, number2, operator);
                data[i][1] = Integer.toString(result);
              }
            Engine.start(data, TASK);
        }
    }


