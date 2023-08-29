package java2;

import java.util.ArrayList;

public class JavaConstructor {
	public static void main(String arg[]) {
		Human human1 = new Human("Sujan Rijal", 25, 72);
		Human human2 = new Human("Bhuwan Rijal", 30, 72);

		ArrayList<Human> humans = new ArrayList<>();
		humans.add(human1);
		humans.add(human2);

		human1.eat();
		human2.drink();

	}

}

class Human {
	String name;
	int age;
	int weigh;

	Human() {

	}

	Human(String name, int age, int weigh) {
		this.name = name;
		this.age = age;
		this.weigh = age;
	}

	void eat() {
		System.out.println(this.name + " is Eating.");
	}

	void drink() {
		System.out.println(this.name + " is Drinking.");
	}

}