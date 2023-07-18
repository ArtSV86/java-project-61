package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class GameParityCheck {

    public static void gameEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        String answer;
        int counter = 0;
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            int number = random.nextInt(1000);
            System.out.println("Question: " + number);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your answer: " + (answer = scanner.nextLine()));
            if (answer.equals("yes")) {
                if (number % 2 == 0) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (answer.equals("no")) {
                if (number % 2 != 0) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
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