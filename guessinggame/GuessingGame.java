import java.util.Scanner;

public class GuessingGame {
 public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int guessCount = 0;
        System.out.println("Guess my number!");
        while (guess != secretNumber){
            System.out.println("Pick a number between 1 and 100");
            guess = input.nextInt();
    
             if (guess < secretNumber) {
                System.out.println("The number you guessed is too low, try again");
                guessCount += 1;
            } else if (guess > secretNumber) {
                System.out.println("The number you guessed is too high, try again");
                guessCount += 1;
            } else {
                System.out.println("Congrats! You guessed the correct number of " + secretNumber);
                guessCount += 1;
                System.out.println("It took you " + guessCount + " guesses");
            }
       }
    }
}