package javaproblems;
import java.util.Scanner;

public class problem14 {
//HCF/GCD Of Two Numbers Program
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		while (num2 != 0) {
		    int temp = num2;
		    num2 = num1 % num2;
		    num1 = temp;
		}
		System.out.println(num1);
	}
}
