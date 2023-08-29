package java3.encapsulation;

public class Main {
	public static void main(String args[]) {

		Car car = new Car("Chevrolet", "Cameero", 2021);
		car.setYear(2023);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getyear());
		
	}

}
