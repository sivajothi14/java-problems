package javaproblems;
import java.util.Scanner;

public class problem9 {
	//Calculate Electricity Bill

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the units");
	double units=sc.nextDouble();
	double bill=0;
	if(units<=100) {
		bill=units*5;
		System.out.println("the bill amount is:"+bill);
	}
	else if(units<=300) {
		bill=units*7;
		System.out.println("the bil amount is:" +bill);
	}
	else
	{
		bill=units*10;
		System.out.println("the bill amount is:" +bill);
	}
	}

}
