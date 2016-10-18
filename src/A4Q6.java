
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create scanner for user input
        Scanner input = new Scanner(System.in);
        //Ask the user their name
        System.out.println("What is your name?");
        String name = input.nextLine();
        //Ask user how many minutes they spend at various times
        System.out.println("How many daytime minutes do you use?");
        int daytimeMinutes = input.nextInt();
        System.out.println("How many evening minutes do you use?");
        int eveningMinutes = input.nextInt();
        System.out.println("How many weekend minutes do you use?");
        int weekendMinutes = input.nextInt();
        //Calculate the cost of plan a
        double planADaytimeCost = (daytimeMinutes - 100) * 0.25;
        if (planADaytimeCost < 0) {
            planADaytimeCost = 0;
        }
        double planACost = planADaytimeCost + eveningMinutes * 0.15 + weekendMinutes * 0.20;
        planACost = Math.round(planACost * 100) / 100.0;
        //Calculate the cost of plan b
        double planBDaytimeCost = (daytimeMinutes - 250) * 0.45;
        if (planBDaytimeCost < 0) {
            planBDaytimeCost = 0;
        }
        double planBCost = planBDaytimeCost + eveningMinutes * 0.35 + weekendMinutes * 0.25;
        planBCost = Math.round(planBCost * 100) / 100.0;
        //Tell the user what each plan would cost
        System.out.println("Plan A costs $" + planACost);
        System.out.println("Plan B costs $" + planBCost);
        //Tell the user which plan is cheaper
        if (planACost > planBCost) {
            System.out.println("Plan B is the cheaper option.");
        } else if (planBCost > planACost) {
            System.out.println("Plan A is the cheaper option.");
        } else if (planBCost == planACost) {
            System.out.println("Neither Plan A nor Plan B is cheaper than the other.");
        }
    }
}
