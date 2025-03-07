package javaproblems;
import java.util.Scanner;
//Factorial Program In Java
public class problem8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
			
		}
		System.out.println("the factorial of the number"+num + "is"+factorial);
	}
	
}
