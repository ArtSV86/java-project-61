package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class PrimeNumber {
    public static void prime() {
        String answer;
        int counter = 0;
        int count = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        do {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer: " + (answer = scanner.nextLine()));

            if (answer.equals("yes")) {
                if (number > 1 && number <= 3) {
                    System.out.println("Correct!");
                    counter++;
                } else if (number >= 0 && number <= 1) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    counter = 0;
                    break;
                } else if (number > 3) {
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            count++;
                        }
                    }
                    if (count >= 1) {
                        System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    } else {
                        System.out.println("Correct!");
                        counter++;
                    }
                }
            } else if (answer.equals("no")) {
                if (number > 1 && number <= 3) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                } else if (number >= 0 && number <= 1) {
                    System.out.println("Correct!");
                    counter++;
                } else if (number > 3) {
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            count++;
                        }
                    }

                    if (count >= 1) {
                        System.out.println("Correct!");
                        counter++;
                    } else {
                        System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    }
                }
            } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes' or 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }

        } while (counter < 3) ;
        if (counter == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}


