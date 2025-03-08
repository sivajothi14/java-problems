package javaproblems;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // August has 31 days
        int totalDays = 31;
        int count = 0;
        
        for (int day = 1; day <= totalDays; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }
        
        System.out.println("Kunal can go out on " + count + " days in August.");
        
        sc.close();
    }
}
