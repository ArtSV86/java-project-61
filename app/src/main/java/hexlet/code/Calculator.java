package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Calculator {


    private static String generateOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(3);
        return operators[i];
    }
    public static void gameCalc() {
        int answer;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        do {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            String operator = generateOperator();
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.println("Your answer: " + (answer = scanner.nextInt()));
            if (operator.equals("+")) {
                int sum = number1 + number2;
                if (answer == sum) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + sum + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (operator.equals("-")) {
                int diff = number1 - number2;
                if (answer == diff) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + diff + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (operator.equals("*")) {
                int multiplication = number1 * number2;
                if (answer == multiplication) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + multiplication + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }

            }
            } while (counter < 3) ;
           if (counter == 3) {
               System.out.println("Congratulations, " + name + "!");
           }
        }
    }


