import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
    private static Scanner scanner = new Scanner(System.in); // Declare scanner here

    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1; // Random number between 1 and 100
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");

        makeAGuess(); // Start the guessing process
    }

    private static void makeAGuess() {
        // Prompt the user for a guess
        System.out.print("Enter your guess: ");

        // Check if the input is a valid number
        if (scanner.hasNextInt()) {
            int guess = scanner.nextInt(); // Read user input

            // Compare the guess with the random number
            if (guess < rnd_number) {
                System.out.println("Your guess is too low. Try again.");
                makeAGuess(); // Let the user guess again
            } else if (guess > rnd_number) {
                System.out.println("Your guess is too high. Try again.");
                makeAGuess(); // Let the user guess again
            } else {
                System.out.println("Congratulations! You've guessed the number: " + rnd_number);
                // Game over, you could end the game here or restart if desired
            }
        } else {
            // If the input was not an integer
            System.out.println("That's not a valid number. Please enter a number between 1 and 100.");
            scanner.next(); // Clear the invalid input
            makeAGuess(); // Let the user try again
        }
    }
}