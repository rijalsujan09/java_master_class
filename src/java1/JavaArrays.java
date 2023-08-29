package java1;

import java.util.Scanner;

public class JavaArrays {
	public static void main(String args[]) {

//		String cars[] = { "Camero", "Corvet", "Tesla", "Volvo","BMW", };
//
//		System.out.println(cars[2]);
//		System.out.println(cars[4]);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int length = scan.nextInt();
		String cars[] = new String[length];

		for (int i = 0; i <length; i++) {
			System.out.println("Enter Element for index : " + i);
			cars[i] = scan.next();
		}

		for (String element : cars) {
			System.out.print(element + " ");
		}

	}

}
