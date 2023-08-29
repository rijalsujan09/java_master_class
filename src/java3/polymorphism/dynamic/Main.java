package java3.polymorphism.dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Animal animal;
		System.out.println("Choose your Choice =>\n(1 = cat)\t(2 = dog)");
		System.out.println("Enter : ");

		int choice = scan.nextInt();
		if (choice == 1) {
			animal = new Cat();
			animal.speak();
		} else if (choice == 2) {
			animal = new Dog();
			animal.speak();
		} else {
			animal = new Animal();
			animal.speak();
		}
		scan.close();

	}

}
