
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for user input
        Scanner input = new Scanner(System.in);
        //Ask the user for the speed limit
        System.out.println("Please enter the speed limit");
        int speedLimit = input.nextInt();
        //Ask the user for the recorded speed of the car
        System.out.println("Please enter the recorded speed of the car");
        int carSpeed = input.nextInt();
        //Determine if the car was speeding
        int overLimit = carSpeed - speedLimit;
        //Show the user the fine
        if (overLimit <= 0) {
            System.out.println("You are within the speed limit.");
        } else if (overLimit <= 20) {
            System.out.println("You are speeding and could recieve a fine of $100.");
        } else if (overLimit <= 30) {
            System.out.println("You are speeding and could recieve a fine of $270.");
        } else if (overLimit >= 31) {
            System.out.println("You are speeding and could recieve a fine of $500.");
        }
    }
}
