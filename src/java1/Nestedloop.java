package java1;

import java.util.Scanner;

public class Nestedloop {

	public static void main(String arg[]) {

		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Rows :");
		int row = scan.nextInt();
		System.out.print("Enter Column : ");
		int column = scan.nextInt();
		System.out.print("Enter symbol : ");
		String symbol = scan.next();

		for (int i = 1; i <= row; i++) {
			System.out.println();
			for (int j = 1; j <= column; j++) {
				System.out.print(symbol + " ");
			}
		}
	}

}
