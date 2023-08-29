package java2;

import java.util.Random;

public class VariableScope {
	public static void main(String args[]) {

		DiceRoller diceRoller = new DiceRoller();
		diceRoller.roll();

	}

}

class DiceRoller {
	Random random;
	int number;

	DiceRoller() {
		random = new Random();
	}

	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
