import java.util.Scanner;

public class Calculations {
    private Double firstNumber;
    private Double secondNumber;
    Scanner scanner = new Scanner(System.in);

    public void addition() {
        System.out.println("Podaj pierwszą liczbe:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Wynik to: " + (firstNumber + secondNumber));
        System.out.println();
    }
    public void subtraction() {
        System.out.println("Podaj pierwszą liczbe:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Wynik to: " + (firstNumber - secondNumber));
        System.out.println();
    }
    public void multiply() {
        System.out.println("Podaj pierwszą liczbe:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Wynik to: " + (firstNumber * secondNumber));
        System.out.println();
    }
    public void divide() {
        System.out.println("Podaj pierwszą liczbe:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Podaj drugą liczbe:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Wynik to: " + (firstNumber / secondNumber));
        System.out.println();
    }
}

