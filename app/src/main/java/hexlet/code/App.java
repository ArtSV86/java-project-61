package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Calculator;
import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.GameParityCheck;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.PrimeNumber;



public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        System.out.println("Your choice: " + command);
        switch (command) {
            case 1:
                Cli.greet();
                break;
            case 2:
                GameParityCheck.gameEven();
                break;
            case 3:
                Calculator.gameCalc();
                break;
            case 4:
                GreatestCommonDivisor.GCD();
                break;
            case 5:
                ArithmeticProgression.progression();
                break;
            case 6:
                PrimeNumber.prime();
                break;
            case 0:
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
