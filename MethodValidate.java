package day4_24_09_2024_1;

import java.util.Scanner;

public class MethodValidate {

	public static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("Person is not Eligible for Voting");
		else
			System.out.println("Person is Eligible  for Voting                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
	}

	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int a;
			System.out.println("Enter age");
			a=sc.nextInt();
			validate(a);
		}

}
