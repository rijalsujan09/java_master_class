package java2;

public class A_CarObject {
	public static void main(String args[]) {

		Car myCar1 = new Car();

		Car myCar2 = new Car();

		System.out.println("Model : " + myCar1.model);
		System.out.println("Model : " + myCar1.make);

		myCar1.drive();
		myCar1.brake();
		
		System.out.println("Model : " + myCar2.model);
		System.out.println("Model : " + myCar2.make);

		myCar2.drive();
		myCar2.brake();


	}
}

class Car {
	String make = "chervolet";
	String model = "corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.000;

	void drive() {
		System.out.println("You Drive the car.");
	}

	void brake() {
		System.out.println("You step on the brake.");
	}

}
