package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class GreatestCommonDivisor {
    int resultGCD;
    private int findGCD(int number1, int number2) {
        for (int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                resultGCD = i;
            }
        }
        return resultGCD;
    }
    public static void GCD() {
        int answer;
        int counter = 0;
        int result;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        do {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            System.out.println("Question: " + number1 + " " + number2);
            System.out.println("Your answer: " + (answer = scanner.nextInt()));
            result = new GreatestCommonDivisor().findGCD(number1, number2);
            if (answer == result) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }

        } while (counter < 3) ;
        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
