package javaproblems;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interes

public class problem4 {

 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount in rs");
		int pr=sc.nextInt();
		System.out.println("Enter rate %");
		int ra=sc.nextInt();
		System.out.println("Enter time in yrs");
		int time=sc.nextInt();		
		int simp=(pr*ra*time)/100;
		System.out.println("the simple interest is:" +simp);
	}

}
