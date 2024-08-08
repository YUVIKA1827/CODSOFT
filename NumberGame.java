// NUMBER GAME
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MAX_ATTEMPTS = 5;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int totalScore = 0;

        do {
            playAgain = false;
            int targetNumber = generateRandomNumber(LOWER_BOUND, UPPER_BOUND);
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between " + LOWER_BOUND + " and " + UPPER_BOUND + ". You have " + MAX_ATTEMPTS + " attempts.");

            while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    totalScore += (MAX_ATTEMPTS - attempts + 1); // Score based on attempts remaining
                } else if (guess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.println("Your current score: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("yes")) {
                playAgain = true;
            }

        } while (playAgain);

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }

    private static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
