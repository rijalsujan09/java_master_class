package java1;

import java.util.Scanner;

public class IfStatement {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your Age.");

		int x = scan.nextInt();

		if (x >= 75) {
			System.out.println("You are ok boomer.");
		} else if (x >= 18) {
			System.out.println("You are an adult.");
		} else if (x >= 13) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You  are a child.");
		}

		scan.close();
	}
}
