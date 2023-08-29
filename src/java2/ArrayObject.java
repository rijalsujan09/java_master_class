package java2;

public class ArrayObject {

	public static void main(String args[]) {

//		int[] numbers = new int[3];
//		char[] chars = new char[5];
//		String[] name = new String[2];
//		Food[] refrig = new Food[3];

		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("sandwich");

		Food[] refrig = { food1, food2, food3 };

//		refrig[0] = food1;
//		refrig[1] = food2;
//		refrig[2] = food3;

		System.out.println(refrig[2].name);

	}

}

class Food {
	String name;

	Food(String name) {
		this.name = name;
	}

}