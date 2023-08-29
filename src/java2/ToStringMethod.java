package java2;

public class ToStringMethod {
	public static void main(String arg[]) {

		MyCar car = new MyCar();

//		System.out.println(car.toString());
		System.out.println(car);

	}
}

class MyCar {
	String make = "chervolet";
	String model = "corvette";
	int year = 2020;

	public String toString() {

		return make + "\n" + model + "\n" + year;

	}

}