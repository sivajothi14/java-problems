package javaproblems;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.
public class problem1 {			

			  public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in);
			        
			        

			        System.out.print("Enter a string: ");
			        String str = scanner.nextLine();
			        String org=str;
			        String rev="";
			        int len=str.length();
			        for(int i=len-1;i>=0;i--) {
			        	rev=rev+str.charAt(i);
			        }

			        if (org.equals(rev)) {
			            System.out.println(str + " is a palindrome.");
			        } else {
			            System.out.println(str + " is not a palindrome.");
			        }

			        scanner.close();
			    }

		
		
	}

