package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static void start(String[][] data, String task) {
        int counter = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(task);
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            String question = data[i][0];
            System.out.println("Question: " + question);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String rightAnswer = data[i][1];


            if (!rightAnswer.equals(answer)) {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
                counter++;
            }
        }
        if (counter == ROUNDS_NUMBER) {
            System.out.println("Congratulations, " + name + "!");

        }
    }
}
