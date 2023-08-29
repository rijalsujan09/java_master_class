package java2;

public class OverLoadedConstructer {
	public static void main(String args[]) {

		Pizza pizza1 = new Pizza("Thick-crust", "Tomato", "mozzerrla", "olives");

		Pizza pizzaVegan = new Pizza("Thin-crust", "Tomato", "olives");

		System.out.println("Here are the ingreadent for Your Pizza:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);

		System.out.println();

		System.out.println("Here are the ingreadent for Your Vegan Pizza:");
		System.out.println(pizzaVegan.bread);
		System.out.println(pizzaVegan.sauce);
		System.out.println(pizzaVegan.cheese);

	}

}

class Pizza {

	String bread;
	String sauce;
	String cheese;
	String topping;

	Pizza() {

	}

	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}

	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;

	}

}