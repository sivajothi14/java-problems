package javaproblems;
import java.util.Scanner;
//basic calculator program with if else statement.

public class problem5 {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		while(true) {

			System.out.println("enter a operator");
			char op=sc.next().charAt(0);
			if(op=='+'||op=='-'||op=='*'||op=='/') {
				System.out.println("enter 2 numbers");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				if(op=='+'){
					ans=num1+num2;
				}
				if(op=='-') {
					ans=num1-num2;
				}
				if(op=='*') {
					ans=num1*num2;
				}
				if(op=='/') {
				ans=num1/num2;
				}
				System.out.println("the result is"+ans);
			}
				else if(op=='x'||op=='X'){
					break;
				}
						else {
				System.out.println("invalid!!");
			}
		}
	
}
}