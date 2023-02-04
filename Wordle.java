
/**
 * Wordle in a terminal with some color codes
 *
 * @ By Daniel Hoskins
 * @version (2/4/23)
 */

import java.util.Scanner;

public class Wordle
{
    public static void main (String[] args)
    {
        //Making the background of each letter with these color codes

        // Yes is green
        final String YES = "Yes-";
        // Maybe is yellow
        final String MAYBE = "Maybe-";
        // No is blank/black
        final String NO = "No-";

        System.out.println("WORDLE!");
        String correct = "PLANT";

        Scanner sc = new Scanner(System.in);
        String guess = "";

        // Loop for 6 guesses
        for(int round=0; round<6; round++) {
            System.out.print("Insert guess ---> ");
            guess = sc.nextLine().toUpperCase();

            // Making a loop to compare through each letter
            //it's 5 because there's 5 letters in wordle
            for (int i=0;i<5;i++) 
            {
                if (guess.substring(i,i+1).equals((correct.substring(i,i+1)))) {

                    // if the letters match, it will say "yes"
                    System.out.print(YES + guess.substring(i,i+1) + ", ");
                    // index identifies where a leter is in a different string
                } else if (correct.indexOf(guess.substring (i,i+1)) > -1) {
                    // if letter is in word but in different spot,make it "maybe"
                    System.out.print(MAYBE + guess.substring(i,i+1) + ", "); 
                } else {
                    // if letter not found, it will say "no"
                    System.out.print(NO + guess.substring(i,i+1) + ", ");

                }
            }
            System.out.println("");

            //if guess is correct, game will end
            if(guess.equals(correct)){
                System.out.println("Correct! You win!");
                break;
            }
        }
        // Print the that if player loses with the correct answer
        if(!guess.equals(correct))
        {
            System.out.println("Wrong! The correct word is " + correct + ".");
        }
    }
}
