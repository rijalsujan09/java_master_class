package java2;

public class ObjectPassing {
	public static void main(String arg[]) {

		Garage garage = new Garage();
		
		Truck truck1 = new Truck("Cyber Truck");
		Truck truck2 = new Truck("RAM Truck");

		garage.park(truck1);
		garage.park(truck2);

	}

}

class Garage {
	void park(Truck myTruck) {
		System.out.println("The " + myTruck.name + " is parked in my garage.");

	}
}

class Truck {

	String name;

	Truck(String name) {
		this.name = name;
	}

}