package java1;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String args[]) {

		// 2D Arrays
		int num[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter element for Array " + "[" + i + "]" + "[" + j + "] : ");
				num[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j]+" ");
			}
		}
	}
}
