package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.GameParityCheck;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.PrimeNumber;


public class App {
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        System.out.println("Your choice: " + command);
        switch (command) {
            case GREET:
                Cli.greet();
                break;
            case EVEN:
                GameParityCheck.runEven();
                break;
            case CALC:
                Calculator.runCalc();
                break;
            case GCD:
                GreatestCommonDivisor.runGcd();
                break;
            case PROGRESSION:
                ArithmeticProgression.runProgression();
                break;
            case PRIME:
                PrimeNumber.runPrime();
                break;
            case EXIT:
                System.out.println("Exit");
                break;
            default:
                System.out.println("There's no such game!");
                break;
        }
    }

    public static void printMenu() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}
