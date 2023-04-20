import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100 (inclusive)
        int guess;
        int numGuesses =10;

        System.out.println("I'm thinking of a number between 1 and 200. Can you guess what it is?");

        do {
            System.out.print("Enter your number");
            guess = scanner.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("Too low! ");
            } else if (guess > secretNumber) {
                System.out.println("Too high! ");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses!");
            }
        } while (guess != secretNumber);
    }
}