package java1;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String name = "";

		do {
			System.out.print("Enter Your Name.");
			name = scan.nextLine();
		} while (name.isBlank());

		System.out.println("Hello " + name);
	}
}
