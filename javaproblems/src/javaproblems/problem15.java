package javaproblems;
import java.util.Scanner;

// LCM Of Two Numbers
public class problem15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();  // Closing scanner

        int c = a * b;  // Store product of a and b
        int temp;

        // Compute HCF using Euclidean algorithm
        int x = a, y = b;
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x; // HCF of a and b
        int lcm = c / hcf; // LCM formula: (a * b) / HCF

        // Print result
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
