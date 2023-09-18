package javaprogram.customexception;

import java.util.Scanner;

public class Eligible {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age ");
		int age = sc.nextInt();
		
		if(age>=18)
			System.out.println("Person is eligible for voting");
		else
			throw new NotEligibleForVoting("person age is less than 18");
	
	}
}
