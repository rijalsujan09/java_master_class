package java3.interfaces;

public class Main {

	public static void main(String[] args) {
		Rabbit rabit = new Rabbit();
		rabit.run();

		Fox fox = new Fox();
		fox.hunts();

		Fish fish = new Fish();
		fish.run();
		fish.hunts();
	}

}
