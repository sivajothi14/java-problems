package javaproblems;
import java.util.Scanner;
//Take 2 numbers as input and print the largest number.
public class problem6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(num1>num2) {
		System.out.println("THE LARGEST NUMBER IS:" +num1);
	}else {
		System.out.println("THE LARGEST NUMBER IS:"+num2);
	}
	

}

	}
