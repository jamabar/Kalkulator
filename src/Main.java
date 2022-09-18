import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Calculations calculations = new Calculations();

        while (shouldContinue) {
            System.out.println("Dodawanie");
            System.out.println("Odejmowanie");
            System.out.println("Mnożenie");
            System.out.println("Dzielenie");
            System.out.println("Wyjście");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1 -> calculations.addition();
            case 2 -> calculations.subtraction();
            case 3 -> calculations.multiply();
            case 4 -> calculations.divide();
            case 5 -> shouldContinue = false;
        }
        }
    }
}