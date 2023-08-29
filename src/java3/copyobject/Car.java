package java3.copyobject;

public class Car {

	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year) {
		this.setMake(make);
		this.setmodel(model);
		this.setYear(year);
	}

	Car(Car car1) {
		this.copy(car1);
	}

	// getter
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getyear() {
		return year;
	}

	// setter

	public void setMake(String make) {
		this.make = make;
	}

	public void setmodel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void copy(Car carx) {
		this.setMake(carx.getMake());
		this.setmodel(carx.getModel());
		this.setYear(carx.getyear());

	}

}
