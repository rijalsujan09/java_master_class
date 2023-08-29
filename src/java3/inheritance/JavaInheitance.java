package java3.inheritance;

public class JavaInheitance {

	public static void main(String arg[]) {

		Car myCar = new Car();
		Truck myTruck = new Truck();

		myCar.move();
		myCar.stop();

		myTruck.move();
		myTruck.stop();

		System.out.println("Car has " + myCar.wheals + " Wheels.");

		System.out.println("Truck has " + myTruck.wheals + " Wheels.");

	}

}
