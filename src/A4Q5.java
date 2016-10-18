
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitaa8228
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create Scanner for user input
        Scanner input = new Scanner(System.in);
        //Ask user for their name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        //Greet the user
        System.out.println("Hello " + name);
        //Ask the user for their first test score
        System.out.println("What was the first test out of?");
        int testMax1 = input.nextInt();
        System.out.println("What mark did you get?");
        int testMark1 = input.nextInt();
        //Calculate the mark for their first test
        double testScore1 = testMark1 * 100.0 / testMax1;
        //Ask the user for their second test score
        System.out.println("What was the second test out of?");
        int testMax2 = input.nextInt();
        System.out.println("What mark did you get?");
        int testMark2 = input.nextInt();
        //Calculate the mark for their second test
        double testScore2 = testMark2 * 100.0 / testMax2;
        //Ask the user for their third test score
        System.out.println("What was the third test out of?");
        int testMax3 = input.nextInt();
        System.out.println("What mark did you get?");
        int testMark3 = input.nextInt();
        //Calculate the mark for their third test
        double testScore3 = testMark3 * 100.0 / testMax3;
        //Ask the user for their fourth test score
        System.out.println("What was the fourth test out of?");
        int testMax4 = input.nextInt();
        System.out.println("What mark did you get?");
        int testMark4 = input.nextInt();
        //Calculate the mark for their fourth test
        double testScore4 = testMark4 * 100.0 / testMax4;
        //Ask the user for their fifth test score
        System.out.println("What was the fifth test out of?");
        int testMax5 = input.nextInt();
        System.out.println("What mark did you get?");
        int testMark5 = input.nextInt();
        //Calculate the mark for their fifth test
        double testScore5 = testMark5 * 100.0 / testMax5;
        //Calculate average score
        double average = (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5.0;
        //Show the user their test scores
        System.out.println("Here are your test scores " + name);
        System.out.println("Test 1: " + testScore1 + "%");
        System.out.println("Test 2: " + testScore2 + "%");
        System.out.println("Test 3: " + testScore3 + "%");
        System.out.println("Test 4: " + testScore4 + "%");
        System.out.println("Test 5: " + testScore5 + "%");
        System.out.println("Average: " + average + "%");
    }
}
