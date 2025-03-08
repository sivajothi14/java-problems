package javaproblems;
//calculate average of N numbers.
import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("enter number of elments for finding average");
		int n=sc.nextInt();
		System.out.println();
	for(int i=1;i<=n;i++) {
		System.out.println( i );
		double num=sc.nextDouble();
		sum+=num;
		
	}
	double average = (n > 0) ? (sum / n) : 0;
    System.out.println("The average of " + n + " numbers is: " + average);


	}

}
