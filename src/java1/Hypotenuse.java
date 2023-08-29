package java1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hypotenuse {
	public static void main(String args[]) {
		int a, b, c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Value of  a:  ");
		a = scan.nextInt();
		b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b: "));
		c = (int) Math.sqrt((a * a) + (b * b));

		System.out.println("The hypoteneous is : " + c);

		scan.close();

	}

}
