package java3.exceptionhandelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {

			System.out.println("Enter a whole number to divide : ");
			int x = scan.nextInt();

			System.out.println("Enter a whole number to divide by : ");
			int y = scan.nextInt();

			int z = x / y;

			System.out.println("Result : " + z);
		} catch (ArithmeticException e) {

			System.out.println("You can not divide by zero idiot:");
		} catch (InputMismatchException e) {

			System.out.println("Please Enter a hole number:");
		} catch (Exception e) {
			System.out.println("something went Wrong");
		} finally {
			System.out.println("This is a finnally block:");
			scan.close();
		}

	}

}
