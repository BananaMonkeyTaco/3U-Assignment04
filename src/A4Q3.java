
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make Scanner for user input
        Scanner input = new Scanner(System.in);
        //Ask the user for 4 numbers
        System.out.println("Please input 4 numbers seperately");
        //Save the numbers
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        //Tell the user the numbers they inputted
        System.out.println("The numbers you gave were " + num1 + ", " + num2 + ", " + num3 + ", and " + num4);
    }
}
