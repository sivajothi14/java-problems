package javaproblems;

import java.util.Scanner;

public class problem12 {
	//Reverse A String In Java

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String name=sc.nextLine();
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("the reversed String is:"+rev);
	}

}

