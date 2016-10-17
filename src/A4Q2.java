
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for input
        Scanner input = new Scanner(System.in);
        //Ask the user for the inches they want converted
        System.out.println("Please enter the measurement you want in inches you want to convert");
        int inches = input.nextInt();
        //Make conversion to centimeters
        double centimeters = inches * 2.54;
        //Show the user the conversion
        System.out.println(inches + " inches is the same as " + centimeters + " centimeters");
    }
}
