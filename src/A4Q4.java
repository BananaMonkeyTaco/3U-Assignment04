
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for user input
        Scanner input = new Scanner(System.in);
        //Set price of ticket
        int ticket = 35;
        //Ask user for the expenses of the prom
        System.out.println("How much will the food for prom cost?");
        int food = input.nextInt();
        System.out.println("How much will the DJ cost?");
        int dj = input.nextInt();
        System.out.println("How much will it cost to rent the hall?");
        int hall = input.nextInt();
        System.out.println("How much will the decorations cost?");
        int decorations = input.nextInt();
        System.out.println("How much will the staff cost?");
        int staff = input.nextInt();
        System.out.println("How much is needed for any miscellaneous costs?");
        int miscellaneous = input.nextInt();
        //Calculate the total cost
        int totalCost = food + dj + hall + decorations + staff + miscellaneous;
        //Calculate required tickets
        int breakPoint = totalCost / ticket + 1;
        //Tell the user the cost and tickets needed to break even
        System.out.println("The total cost will be " + totalCost + ". You will need to sell " + breakPoint + " tickets to break even");
    }
}
