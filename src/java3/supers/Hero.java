package java3.supers;

public class Hero extends Person {
	String power;

	Hero(String name, int age) {
		super(name, age);

	}

	Hero(String power, String name, int age) {
		super(name, age);
		this.power = power;
	}

	public String toString() {
		return super.toString() + this.power;
	}

}
