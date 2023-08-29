package java2;

public class StaticModifier {

	public static void main(String args[]) {

		Friend friend1 = new Friend("Sponge Bob");
		Friend friend2 = new Friend("Pattric");
		Friend friend3 = new Friend("Squidward");

		Friend.displayFriend();

	}

}

class Friend {

	String name;
	static int numOfFriend;

	Friend(String name) {
		this.name = name;
		numOfFriend++;
	}

	static void displayFriend() {
		System.out.println("You  have " + numOfFriend + " friend");
	}

}
