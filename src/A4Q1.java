
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for input
        Scanner input = new Scanner(System.in);
        //Ask user for their name
        System.out.println("Please enter your name");
        //Set user input as their name
        String name = input.nextLine();
        //Greet the user
        System.out.println("Hey " + name + ", How are you doing today?");
    }
}
