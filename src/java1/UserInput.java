package java1;

import java.util.Scanner;

public class UserInput {

	public static void main(String arg[]) {

		Scanner scn = new Scanner(System.in);
		System.out.println("What is your name? ");
	
		String name = scn.nextLine();
		System.out.println("Your Name is : "+ name);
		System.out.println("\nWhat is you age? ");
		int age = scn.nextInt();
		System.out.println("Your age is : "+ age);
		System.out.println("\nWhat is fav city? ");
		scn.nextLine();
		String city = scn.nextLine();
		System.out.println("Your fav city is : "+city);
		scn.close();
	}
}
