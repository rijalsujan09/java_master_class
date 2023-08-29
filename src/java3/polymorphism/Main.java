package java3.polymorphism;

public class Main {
	public static void main(String args[]) {

		Car c = new Car();
		Bycicle b = new Bycicle();
		Boat bo = new Boat();

		Vehicle[] racers = { c, b, bo };

		for (Vehicle v : racers) {
			v.go();
		}

	}
}
