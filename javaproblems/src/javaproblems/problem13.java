package javaproblems;
import java.util.Scanner;

//Java Program Vowel Or Consonant
public class problem13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
	char ch=sc.next().toLowerCase().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("the character is vowel");
	}
	else {
		System.out.println("the character is a consonent");
	}
	
	
	
		
	

	}

}
