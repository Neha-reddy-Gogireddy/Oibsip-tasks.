import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
        
        /**
         * @param args
         */
        public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1 ;
        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-100):");
            Scanner SC = new Scanner(System.in); {
                int playerGuess = SC.nextInt();
                tryCount++;
                if (playerGuess == randomNumber) {
                    System.out.println("Correct! You Win!");
                    System.out.println("It took you" + tryCount + "tries");
                    break;
                }
                else if (randomNumber > playerGuess) {
                    System.out.println("Nope! The Number Is Higher. Guess Again.");
                }
                else {
                    System.out.println("Nope! The Number Is Lower. Guess Again.");
                }
            }
          
        }
    }
}
