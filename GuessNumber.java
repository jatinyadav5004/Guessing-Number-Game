
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random_number = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rounds you want to play: ");
        int num_rounds = scan.nextInt();
        int total_score = 0;
        for (int round = 1; round <= num_rounds; round++) {
            int right_guess = random_number.nextInt(100);
            int turns = 0;
            System.out.println("***Round " + round + ": Guess a number between 1 to 100, You will have 10 turns!***");
            System.out.println("Best of luck!!!");
            int guess;
            int i = 0;
            boolean win = false;
            while (win == false) {
                guess = scan.nextInt();
                turns++;

                if (guess == right_guess) {
                    win = true;
                } else if (i > 8) {
                    System.out.println("Sorry , you loose! the right answer was: " + right_guess);
                    break;
                } else if (guess < right_guess) {
                    i++;
                    System.out.println("OOPS!, Your Guess is lower than the right guess! Turns left: " + (10 - i));
                } else if (guess > right_guess) {
                    i++;
                    System.out.println("OOPS!, Your Guess is higher than the right guess! Turns left: " + (10 - i));
                }
            }
            if (win == true) {
                int score = (11 - turns) * 10;
                System.out.println();
                System.out.println("****Congratulation, You win the game!****");
                System.out.println();
                System.out.println("The number was " + right_guess);
                System.out.println("You used " + turns + " turns to guess the right number ");
                System.out.println("Your score for this round is " + score + " out of 100");
                total_score += score;
            } else {
                System.out.println("You lost this round!");
            }
        }
        System.out.println("Game over! Your total score for " + num_rounds + " rounds is " + total_score + " out of " + (num_rounds * 100));
    }
}
