
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a Scanner for user input
        Scanner input = new Scanner(System.in);
        //Set the user's square to 1
        int boardSquare = 1;
        //Make game last until the user lands on square 100
        while (boardSquare != 100) {
            //Show the user what square they are on
            System.out.println("You are on square " + boardSquare);
            //Ask the user for the sum of the dice
            System.out.println("Please enter the sum of your dice roll.");
            int diceRoll = input.nextInt();
            //Check to see that the dice roll is in face a dice roll
            if (diceRoll > 12 || diceRoll < 1) {
                System.out.println("Put in a real dice roll you cheater! Back to the beginning with you!");
                boardSquare = 1;
                diceRoll = 0;
            }
            //Check to see if the dice roll would pass 100
            if (boardSquare + diceRoll > 100) {
                System.out.println("Your roll would have passed 100 so you have not moved.");
            } //Add the dice roll to the user's square
            else {
                boardSquare = boardSquare + diceRoll;
            }
            //Set up the snakes and ladders
            if (boardSquare == 54 || boardSquare == 90 || boardSquare == 99) {
                //Tell the user they landed on a snake/ladder
                System.out.println("You have landed on a snake!");
                if (boardSquare == 54) {
                    //Tell the user which snake/ladder they landed on and where they are now
                    System.out.println("You have slid down the snake from Square 54 to Sqaure 19.");
                    //Set the user's new Square
                    boardSquare = 19;
                } else if (boardSquare == 90) {
                    System.out.println("You have slid down the snake from Square 90 to Square 48.");
                    boardSquare = 48;
                } else if (boardSquare == 99) {
                    System.out.println("You have slid down the snake from Square 99 to Square 77.");
                    boardSquare = 77;
                }
            }
            if (boardSquare == 9 || boardSquare == 40 || boardSquare == 67) {
                System.out.println("You have landed on a ladder!");
                if (boardSquare == 9) {
                    System.out.println("You have climbed the ladder from Square 9 up to Square 34.");
                    boardSquare = 34;
                } else if (boardSquare == 40) {
                    System.out.println("You have climbed the ladder from Square 40 up to Square 64.");
                    boardSquare = 64;
                } else if (boardSquare == 67) {
                    System.out.println("You have climbed the ladder from Square 67 up to 86.");
                    boardSquare = 86;
                }
            }
        }
        //Congratulate the player on finishing the game
        System.out.println("You have landed on Square 100 and won the game!");
        System.out.println("Congratulations!");
    }
}
