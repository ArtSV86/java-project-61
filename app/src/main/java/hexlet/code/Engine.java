package hexlet.code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {

        public static void game(String gameName) {
        int counter = 0;
        int answer1;
        String answer;
        String textQuestion;


            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
            switch (gameName) {
                case "GameParityCheck":
                    textQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.";
                    break;
                case "Calculator.gameCalc":
                    textQuestion = "What is the result of the expression?";
                    break;
                case "GreatestCommonDivisor.GCD":
                    textQuestion = "Find the greatest common divisor of given numbers.";
                    break;
                case "ArithmeticProgression.progression":
                    textQuestion = "What number is missing in the progression?";
                    break;
                case "PrimeNumber.prime":
                    textQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
                    break;
                }
            System.out.println(textQuestion);
            System.out.println("Question: " + text);
            System.out.println("Your answer: " + (answer = scanner.nextLine()));
            try
            {
                // именно здесь String преобразуется в int
                answer1 = Integer.parseInt(answer.trim());

            }
            catch (NumberFormatException e)
            {
            }


            do {

                if (answer1 == result1 || answer.equals(result2) ) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }

        } while (counter < 3);
        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}