package hexlet.code.games;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class ArithmeticProgression {

    public static void progression() {

        int[] massive = new int[10];
        int answer;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        do {
            int step = random.nextInt(10);
            int randomNumber = random.nextInt(10);
            massive[0] = random.nextInt(20);
            for (int i = 1; i < massive.length; i++) {
                massive[i] = massive[0] + i * step;
            }

            String str = Arrays.toString(massive).replaceAll("\\[|]| ", "");
            var words = str.split(",");
            words[randomNumber] = "..";
            String newStr = String.join(",", words);
            String text = newStr.replace (',', ' ');
            System.out.println("Question: " + text);
            System.out.println("Your answer: " + (answer = scanner.nextInt()));
            int result =  massive[randomNumber];
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
