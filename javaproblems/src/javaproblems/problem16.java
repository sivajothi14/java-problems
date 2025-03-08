package javaproblems;
import java.util.Scanner;
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

public class problem16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter the days of a month");
		int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("kunal is allowed to go outside");
			}
			for(int count=0;count<=n;count++) {
				count=count/10;
				System.out.println("number of digits:" + count);
				
		}
			
}
	}

