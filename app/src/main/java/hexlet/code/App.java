package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                Cli.greet();
                break;
            } else if (command == 2) {
                GameParityCheck.gameEven();
                break;
            } else if (command == 3) {
                Calculator.gameCalc();
                break;
            } else if (command == 4) {
                GreatestCommonDivisor.GCD();
                break;
            } else if (command == 5) {
                ArithmeticProgression.progression();
                break;
            } else if (command == 6) {
                PrimeNumber.prime();
                break;
            } else if (command == 0) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Sorry, there is no such command.");
                break;
            }
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
