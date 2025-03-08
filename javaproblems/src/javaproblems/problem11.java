package javaproblems;
import java.util.Scanner;
//Calculate Discount Of Product

public class problem11 {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the item name:");
		String name=sc.nextLine();
		System.out.println("enter the list price:");
		double list=sc.nextDouble();
		System.out.println("enter the selling price:");
	    double sell=sc.nextDouble();
		double discount=list-sell;
		System.out.println("the discount price is:"+ discount);
		double discountPer=(discount/list)*100;
         System.out.println("the discount percent is:"+discountPer);		
	}

}
