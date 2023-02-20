/* LargestOfThree.java
 *
 * Dustin Petersen
 * 2/19/2023
 *
 * input: three ints from user
 * processing: find the largest of the three ints with decision structures
 * output: the largest of three ints, the sum of three ints
 */

import java.util.Scanner;

public class LargestOfThree
{
    public static void main(String[] args)
    {
        System.out.println("\n\n ========== The Largest of Three Program =========== \n\n");


        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("\n\n Please enter the first number: ");

        // Input user reply to number 1
        int n1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.println("\n\n Please enter the second number: ");

        // Input user reply to number 2
        int n2 = scanner.nextInt();

        // Prompt the user for the third number
        System.out.println("\n\n Please enter the third and last integer: ");

        // Input user reply to number 3
        int n3 = scanner.nextInt();


        // Math the maths to get total of 3 numbers
        int total = n1 + n2 + n3;

        System.out.println("\n The sum of " + n1 + " and " + n2 + " and " + n3 + " is: " + total);

        // Find the largest of three numbers with nested if statement logic.
        if (n1 >= n2)
        {
            if (n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } else
        {
            if (n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        }


    }
}